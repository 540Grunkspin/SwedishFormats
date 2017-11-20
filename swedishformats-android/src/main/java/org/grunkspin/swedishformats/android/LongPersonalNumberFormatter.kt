package org.grunkspin.swedishformats.android

import org.grunkspin.swedishformats.formatLongPersonalNumber

class LongPersonalNumberFormatter : InputFormatter() {
    override fun formatText(input: String): String = input.formatLongPersonalNumber()
}

