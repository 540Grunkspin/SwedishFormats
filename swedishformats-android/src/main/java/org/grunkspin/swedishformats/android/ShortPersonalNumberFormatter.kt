package org.grunkspin.swedishformats.android

import org.grunkspin.swedishformats.formatShortPersonalNumber

class ShortPersonalNumberFormatter : InputFormatter() {
    override fun formatText(input: String): String = input.formatShortPersonalNumber()
}

