package org.grunkspin.swedishformats.android

import android.text.InputFilter
import android.text.InputType
import android.widget.EditText
import org.grunkspin.swedishformats.LONG_PERSONAL_NUMBER_LENGTH
import org.grunkspin.swedishformats.METER_ID_LENGTH
import org.grunkspin.swedishformats.POSTAL_CODE_LENGTH
import org.grunkspin.swedishformats.SHORT_PERSONAL_NUMBER_LENGTH

/**
 * Sets up the [EditText] to be formatted to as a long personal number
 * YYYYMMDD-XXXX
 */
fun EditText.formatAsLongPersonalNumber() {
    addTextChangedListener(LongPersonalNumberFormatter())
    filters = arrayOf(InputFilter.LengthFilter(LONG_PERSONAL_NUMBER_LENGTH))
}

/**
 * Sets up the [EditText] to be formatted to as a short personal number
 * YYMMDD-XXXX
 */
fun EditText.formatAsShortPersonalNumber() {
    addTextChangedListener(ShortPersonalNumberFormatter())
    filters = arrayOf(InputFilter.LengthFilter(SHORT_PERSONAL_NUMBER_LENGTH))
}

/**
 * Sets up the [EditText] to be formatted to as a meter id.
 *
 * @param forcedPrefix An enforced prefix that the meter id will always start with.
 */
fun EditText.formatAsMeterId(forcedPrefix: String = "") {
    setText(forcedPrefix)
    addTextChangedListener(MeterIdFormatter(forcedPrefix))
    filters = arrayOf(InputFilter.LengthFilter(METER_ID_LENGTH))
}

/**
 * Sets up the input field fo be formatted as a swedish postal code.
 */
fun EditText.formatAsPostalCode() {
    addTextChangedListener(PostalCodeFormatter())
    filters = arrayOf(InputFilter.LengthFilter(POSTAL_CODE_LENGTH))
}

