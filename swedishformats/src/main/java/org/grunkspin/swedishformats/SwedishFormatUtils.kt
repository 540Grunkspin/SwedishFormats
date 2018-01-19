/**
 * Copyright 2017 Anton Holmberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:JvmName("SwedishFormatUtils")

package org.grunkspin.swedishformats

@Suppress("PropertyName")
@JvmField
val POSTAL_CODE_LENGTH = 6
@Suppress("PropertyName")
@JvmField
val METER_ID_LENGTH = 23
@Suppress("PropertyName")
@JvmField
val LONG_PERSONAL_NUMBER_LENGTH = 13
@Suppress("PropertyName")
@JvmField
val SHORT_PERSONAL_NUMBER_LENGTH = 11

/**
 * Formats a string a as swedish postal code.
 *
 * @return A formatted version of the original string.
 */
fun String.formatPostalCode(): String = this
        .unformatPostalCode()
        .replace(Regex("\\d{3}(?!$)")) {
            it.value + " "
        }

/**
 * Removes formatting applied by [formatPostalCode].
 *
 * @return An unformatted version of the original string.
 */
fun String.unformatPostalCode(): String = this.replace(" ", "")

/**
 * Format a string as a meter id.
 *
 * @return A formatted version of the original string.
 */
fun String.formatMeterId(forcedPrefix: String = ""): String = this
        .unformatMeterId()
        .let {
            if (it.length < forcedPrefix.unformatMeterId().length) forcedPrefix.unformatMeterId()
            else it
        }
        .replace(Regex("\\d{3}(?!$)")) {
            it.value + " "
        }

/**
 * Removes formatting applied by [formatMeterId].
 *
 * @return An unformatted version of the original string.
 */
fun String.unformatMeterId(): String = this.replace(" ", "")

/**
 * Format a string as a long swedish personal number (YYYYMMDD-XXXX).
 *
 * @return A formatted version of the original string.
 */
fun String.formatLongPersonalNumber(): String = this
        .unformatPersonalNumber()
        .replace(Regex("\\d{8}(?!$)")) {
            it.value + "-"
        }

/**
 * Format a string as a short swedish personal number (YYMMDD-XXXX).
 *
 * @return A formatted version of the original string.
 */
fun String.formatShortPersonalNumber(): String = this
        .unformatPersonalNumber()
        .replace(Regex("\\d{6}(?!$)")) {
            it.value + "-"
        }

/**
 * Removes formatting applied by either [formatLongPersonalNumber] or [formatShortPersonalNumber].
 *
 * @return An unformatted version of the original string.
 */
fun String.unformatPersonalNumber(): String = this.replace("-", "")
