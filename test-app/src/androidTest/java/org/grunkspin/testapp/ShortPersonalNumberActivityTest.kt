package org.grunkspin.testapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class ShortPersonalNumberActivityTest {
    @JvmField
    @Rule
    val rule = ActivityTestRule(ShortPersonalNumberActivity::class.java)

    @Test
    fun testInputPersonalNumber() {
        onView(withId(R.id.input)).perform(typeText("9301311234"))
        onView(withText("930131-1234")).check(matches(isDisplayed()))
    }
}

