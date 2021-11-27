package com.jogayed.leetcodeproblems

import org.junit.Assert
import org.junit.Test

/**
 * https://leetcode.com/problems/jewels-and-stones/
 *
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 */
class JewelsAndStones {
    fun solution1(jewels: String, stones: String): Int {
        var countOfJewels = 0
        for (i in stones.indices) {
            if (jewels.contains(stones[i])) {
                countOfJewels++
            }
        }
        return countOfJewels
    }

    fun solution2(jewels: String, stones: String): Int {
        return stones.count { jewels.contains(it) }
    }

//=================================================================================================

    @Test
    fun testCase1() {
        val inputJewels = "aA"
        val inputStones = "aAAbbbb"
        val expected = 3
        val actual = solution2(inputJewels, inputStones)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testCase2() {
        val inputJewels = "z"
        val inputStones = "ZZ"
        val expected = 0
        val actual = solution2(inputJewels, inputStones)
        Assert.assertEquals(expected, actual)
    }
}