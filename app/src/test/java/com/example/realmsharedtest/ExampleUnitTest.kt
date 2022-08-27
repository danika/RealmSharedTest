package com.example.realmsharedtest

import com.example.sharedtestcode.FakeThings
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun fakeTest() {
        assertEquals(FakeThings.FAKE_1.firstName, "Jane")
        assertEquals(FakeThings.FAKE_2.firstName, "John")
    }
}