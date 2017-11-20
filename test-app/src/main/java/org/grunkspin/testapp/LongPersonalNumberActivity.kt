package org.grunkspin.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputFilter
import android.widget.EditText
import org.grunkspin.swedishformats.LONG_PERSONAL_NUMBER_LENGTH
import org.grunkspin.swedishformats.android.LongPersonalNumberFormatter

class LongPersonalNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)
        val inputField = findViewById<EditText>(R.id.input)
        inputField.addTextChangedListener(LongPersonalNumberFormatter())
        inputField.filters = arrayOf(InputFilter.LengthFilter(LONG_PERSONAL_NUMBER_LENGTH))
    }
}

