package com.jogayed.leetcodeproplems

import org.junit.Assert
import org.junit.Test
import java.util.*

/**
 *https://leetcode.com/problems/fizz-buzz/
 *
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i if non of the above conditions are true.
 *
 * Example 1:
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 *
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 *
 * Example 3:
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * */


/**
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
class FizzBuzz {

    private fun fizzBuzz(n: Int): List<String> {
        return (1 until n + 1).map { index ->
            when {
                (index % 15 == 0) -> "FizzBuzz"
                (index % 3 == 0) -> "Fizz"
                (index % 5 == 0) -> "Buzz"
                else -> "${(index)}"
            }
        }
    }

//=================================================================================================

    @Test
    fun testCase1() {
        val expectedList = listOf("1", "2", "Fizz")
        val n = 3
        val actualList = fizzBuzz(n)
        Assert.assertEquals(expectedList, actualList)
    }

    @Test
    fun testCase2() {
        val expectedList = listOf("1", "2", "Fizz", "4", "Buzz")
        val n = 5
        val actualList = fizzBuzz(n)
        Assert.assertEquals(expectedList, actualList)
    }

    @Test
    fun testCase3() {
        val expectedList = listOf(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"
        )
        val n = 15
        val actualList = fizzBuzz(n)
        Assert.assertEquals(expectedList, actualList)
    }

}