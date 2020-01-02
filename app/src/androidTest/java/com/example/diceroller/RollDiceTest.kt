package com.example.diceroller

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.not
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*


@RunWith(AndroidJUnit4::class)
class RollDiceTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.diceroller", appContext.packageName)
    }


    // initial test before rolling
//    @Test
//    fun test_display_toast() {
//        Espresso.onView(withId(R.id.roll_button)).perform(click())
//
//        Espresso.onView(withText("Rolling Dice"))
//            .inRoot(withDecorView(not(`is`(rule.activity.window.decorView))))
//            .check(matches(isDisplayed()))
//
//        Espresso.onView(withId(R.id.text_result))
//            .check(matches(withText(rule.activity.getString(R.string.result, 2))))
//    }

    @Test
    fun test_roll_dice() {
        // generate random number
        val randomInt = Random().nextInt(6) + 1

        // set text

        //
    }
}