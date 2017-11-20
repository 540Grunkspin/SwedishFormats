package org.grunkspin.swedishformats.android

import org.grunkspin.swedishformats.formatMeterId

class MeterIdFormatter : InputFormatter() {
    override fun formatText(input: String): String = input.formatMeterId()
}

