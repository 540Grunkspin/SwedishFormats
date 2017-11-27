# Swedish Formats

This is a collection of input formatters that I use on an every day basis.

## Get It!

Add jitpack:

```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency:

```groovy
dependencies {
    implementation 'com.github.540Grunkspin.SwedishFormats:swedishformats:0.2'
    implementation 'com.github.540Grunkspin.SwedishFormats:swedishformats-android:0.2'
}
```

## Supported formats

* Meter ID (Swedish ID for an electricity meter.)
* Personal number (long and short.)
* Postal code (Swedish postal code.)

## Usage

```kotlin
class MeterIdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)
        val inputField = findViewById<EditText>(R.id.input)
        inputField.addTextChangedListener(MeterIdFormatter())
        inputField.filters = arrayOf(InputFilter.LengthFilter(METER_ID_LENGTH))
    }
}
```

Switch the *METER_ID_LENGTH* and *MeterIdFormatter* to something else if you want to format the text
into something else.

## License

Copyright 2017 Anton Holmberg

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.