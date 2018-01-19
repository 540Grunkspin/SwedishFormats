package org.grunkspin.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_input_layout.*
import org.grunkspin.swedishformats.android.formatAsPostalCode

class PostalCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)

        input.formatAsPostalCode()
    }
}

