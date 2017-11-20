package org.grunkspin.testapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MeterIdActivityTest {
    @JvmField
    @Rule
    val rule = ActivityTestRule(MeterIdActivity::class.java)

    @Test
    fun testInputPersonalNumber() {
        onView(withId(R.id.input)).perform(typeText("735999137000000000"))
        onView(withText("735 999 137 000 000 000")).check(matches(isDisplayed()))
    }
}
