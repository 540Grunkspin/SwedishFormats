package org.grunkspin.swedishformats.android

import android.text.InputFilter
import android.widget.EditText
import org.grunkspin.swedishformats.LONG_PERSONAL_NUMBER_LENGTH
import org.grunkspin.swedishformats.METER_ID_LENGTH
import org.grunkspin.swedishformats.POSTAL_CODE_LENGTH
import org.grunkspin.swedishformats.SHORT_PERSONAL_NUMBER_LENGTH

fun EditText.formatAsLongPersonalNumber() {
    addTextChangedListener(LongPersonalNumberFormatter())
    filters = arrayOf(InputFilter.LengthFilter(LONG_PERSONAL_NUMBER_LENGTH))
}

fun EditText.formatAsShortPersonalNumber() {
    addTextChangedListener(ShortPersonalNumberFormatter())
    filters = arrayOf(InputFilter.LengthFilter(SHORT_PERSONAL_NUMBER_LENGTH))
}

fun EditText.formatAsMeterId(forcedPrefix: String = "") {
    setText(forcedPrefix)
    addTextChangedListener(MeterIdFormatter(forcedPrefix))
    filters = arrayOf(InputFilter.LengthFilter(METER_ID_LENGTH))
}

fun EditText.formatAsPostalCode() {
    addTextChangedListener(PostalCodeFormatter())
    filters = arrayOf(InputFilter.LengthFilter(POSTAL_CODE_LENGTH))
}

