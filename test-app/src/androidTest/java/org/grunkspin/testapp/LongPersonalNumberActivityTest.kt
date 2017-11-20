package org.grunkspin.testapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class LongPersonalNumberActivityTest {
    @JvmField
    @Rule
    val rule = ActivityTestRule(LongPersonalNumberActivity::class.java)

    @Test
    fun testInputPersonalNumber() {
        onView(withId(R.id.input)).perform(typeText("199301311234"))
        onView(withText("19930131-1234")).check(matches(isDisplayed()))
    }
}

