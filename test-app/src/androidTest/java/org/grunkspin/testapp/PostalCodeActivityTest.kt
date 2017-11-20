package org.grunkspin.testapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class PostalCodeActivityTest {
    @JvmField
    @Rule
    val rule = ActivityTestRule(PostalCodeActivity::class.java)

    @Test
    fun testInputPersonalNumber() {
        onView(withId(R.id.input)).perform(typeText("12332"))
        onView(withText("123 32")).check(matches(isDisplayed()))
    }
}

