package com.jogayed.leetcodeproblems

import org.junit.Assert
import org.junit.Test

/**
 * https://leetcode.com/problems/length-of-last-word/
 *
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 *
 * Example 2:
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 *
 * Example 4:
 * Input: s = "a"
 * Output: 1
 * Explanation: The last word is "a" with length 1.
 */
class LengthOfLastWord {
    fun solution1(inputString: String): Int {
        val wordsList = inputString.trim().reversed().split(" ")
        for (word in wordsList) {
            if (word.isNotEmpty())
                return word.length
        }
        return 0
    }

    fun solution2(inputString: String): Int {
        var currentWordLength = 0
        var lastWordLength = 0
        for (i in inputString.indices) {
            if (inputString[i] == ' ') {
                currentWordLength = 0
            } else {
                lastWordLength = ++currentWordLength
            }
        }
        return lastWordLength
    }

//=================================================================================================

    @Test
    fun testCase1() {
        val inputString = "Hello World"
        val expected = 5
        val actual = solution2(inputString)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testCase2() {
        val inputString = "   fly me   to   the moon  "
        val expected = 4
        val actual = solution2(inputString)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testCase3() {
        val inputString = "luffy is still joyboy"
        val expected = 6
        val actual = solution2(inputString)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testCase4() {
        val inputString = "a"
        val expected = 1
        val actual = solution2(inputString)
        Assert.assertEquals(expected, actual)
    }

}