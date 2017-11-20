package org.grunkspin.swedishformats.android

import org.grunkspin.swedishformats.formatPostalCode

class PostalCodeFormatter : InputFormatter() {
    override fun formatText(input: String): String = input.formatPostalCode()
}

