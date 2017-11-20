package org.grunkspin.swedishformats.android

import android.text.Editable
import android.text.TextWatcher

abstract class InputFormatter : TextWatcher {
    private var isFormatting = false

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        // Do nothing.
    }

    override fun afterTextChanged(s: Editable?) {
        // To prevent infinite loop
        if (!isFormatting) {
            s?.let {
                val formatted = formatText(it.toString())
                isFormatting = true
                it.replace(0, it.length, formatted)
            }
        } else {
            isFormatting = false
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        // Do nothing.
    }

    abstract fun formatText(input: String): String
}

