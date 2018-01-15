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

val POSTAL_CODE_LENGTH = 6
val METER_ID_LENGTH = 23
val LONG_PERSONAL_NUMBER_LENGTH = 13
val SHORT_PERSONAL_NUMBER_LENGTH = 11

fun String.formatPostalCode(): String = this
        .unformatPostalCode()
        .replace(Regex("\\d{3}(?!$)")) {
            it.value + " "
        }

fun String.unformatPostalCode(): String = this.replace(" ", "")

fun String.formatMeterId(forcedPrefix: String = ""): String = this
        .unformatMeterId()
        .let {
            if (it.length < forcedPrefix.length) forcedPrefix
            else it
        }
        .replace(Regex("\\d{3}(?!$)")) {
            it.value + " "
        }

fun String.unformatMeterId(): String = this.replace(" ", "")

fun String.formatLongPersonalNumber(): String = this
        .unformatPersonalNumber()
        .replace(Regex("\\d{8}(?!$)")) {
            it.value + "-"
        }

fun String.formatShortPersonalNumber(): String = this
        .unformatPersonalNumber()
        .replace(Regex("\\d{6}(?!$)")) {
            it.value + "-"
        }

fun String.unformatPersonalNumber(): String = this.replace("-", "")
