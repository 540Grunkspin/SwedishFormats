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

fun String.formatMeterId(): String = this
        .unformatMeterId()
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
