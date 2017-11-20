package org.grunkspin.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputFilter
import android.widget.EditText
import org.grunkspin.swedishformats.SHORT_PERSONAL_NUMBER_LENGTH
import org.grunkspin.swedishformats.android.ShortPersonalNumberFormatter

class ShortPersonalNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)
        val inputField = findViewById<EditText>(R.id.input)
        inputField.addTextChangedListener(ShortPersonalNumberFormatter())
        inputField.filters = arrayOf(InputFilter.LengthFilter(SHORT_PERSONAL_NUMBER_LENGTH))
    }
}

