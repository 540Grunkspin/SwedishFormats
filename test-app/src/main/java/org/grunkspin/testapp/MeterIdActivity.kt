package org.grunkspin.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputFilter
import android.widget.EditText
import org.grunkspin.swedishformats.METER_ID_LENGTH
import org.grunkspin.swedishformats.android.MeterIdFormatter

class MeterIdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)
        val inputField = findViewById<EditText>(R.id.input)
        inputField.addTextChangedListener(MeterIdFormatter())
        inputField.filters = arrayOf(InputFilter.LengthFilter(METER_ID_LENGTH))
    }
}

