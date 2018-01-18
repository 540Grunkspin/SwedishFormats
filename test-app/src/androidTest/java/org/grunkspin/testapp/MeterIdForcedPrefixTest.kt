package org.grunkspin.testapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MeterIdForcedPrefixTest {
    @JvmField
    @Rule
    val rule = ActivityTestRule(ForcedPrefixMeterIdActivity::class.java)

    @Test
    fun testForcedPrefix() {
        onView(withId(R.id.input)).perform(typeText("137000000000"))
        onView(withText("735 999 137 000 000 000")).check(matches(isDisplayed()))
    }
}

