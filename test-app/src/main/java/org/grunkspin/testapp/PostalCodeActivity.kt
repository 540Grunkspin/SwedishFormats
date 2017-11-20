package org.grunkspin.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputFilter
import android.widget.EditText
import org.grunkspin.swedishformats.POSTAL_CODE_LENGTH
import org.grunkspin.swedishformats.android.PostalCodeFormatter

class PostalCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)
        val inputField = findViewById<EditText>(R.id.input)
        inputField.addTextChangedListener(PostalCodeFormatter())
        inputField.filters = arrayOf(InputFilter.LengthFilter(POSTAL_CODE_LENGTH))
    }
}

