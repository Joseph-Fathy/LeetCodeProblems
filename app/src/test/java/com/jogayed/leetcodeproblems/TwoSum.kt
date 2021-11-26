package com.jogayed.leetcodeproblems

import org.junit.Assert
import org.junit.Test

/**
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Example 4:
 * Input: nums = [1,2,3,4,5,6,7,8], target = 15
 * Output: [6,7]
 *
 * Example 5:
 * Input: nums = [], target = 0
 * Output: []
 *
 * Example 6:
 * Input: nums = [3,2,3], target = 6
 * Output: [0,2]
 *
 * */
class TwoSum {

    fun solution1(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target)
                    return intArrayOf(i, j)
            }
        }

        return intArrayOf()
    }

    fun solution2(nums: IntArray, target: Int): IntArray {
        //map with key: target-current , value: index of current
        //to store the differences between each Item and the target
        val memory = HashMap<Int, Int>()

        for (i in nums.indices) {
            //if the memory contains of the current value as key
            //this means that the the value of this key + the current value = target
            val current = nums[i]
            if (memory.containsKey(current)) {
                return intArrayOf(memory[current]!!, i)
            }
            //add to memory the difference between the target - current as key and the index of
            //the current as value
            val key = target - current
            memory[key] = i
        }
        return intArrayOf()
    }

//=================================================================================================

    @Test
    fun testCase1() {
        val inputArray = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)
        val actual = solution1(inputArray, target)
        println(expected.contentToString())
        println(actual.contentToString())
        Assert.assertTrue(expected contentEquals actual)
    }

    @Test
    fun testCase2() {
        val inputArray = intArrayOf(3, 2, 4)
        val target = 6
        val expected = intArrayOf(1, 2)
        val actual = solution1(inputArray, target)
        println(expected.contentToString())
        println(actual.contentToString())
        Assert.assertTrue(expected contentEquals actual)
    }

    @Test
    fun testCase3() {
        val inputArray = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)
        val actual = solution1(inputArray, target)
        println(expected.contentToString())
        println(actual.contentToString())
        Assert.assertTrue(expected contentEquals actual)
    }

    @Test
    fun testCase4() {
        val inputArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        val target = 15
        val expected = intArrayOf(6, 7)
        val actual = solution2(inputArray, target)
        println(expected.contentToString())
        println(actual.contentToString())
        Assert.assertTrue(expected contentEquals actual)
    }

    @Test
    fun testCase5() {
        val inputArray = intArrayOf()
        val target = 0
        val expected = intArrayOf()
        val actual = solution1(inputArray, target)
        println(expected.contentToString())
        println(actual.contentToString())
        Assert.assertTrue(expected contentEquals actual)
    }


    @Test
    fun testCase6() {
        val inputArray = intArrayOf(3, 2, 3)
        val target = 6
        val expected = intArrayOf(0, 2)
        val actual = solution2(inputArray, target)
        println(expected.contentToString())
        println(actual.contentToString())
        Assert.assertTrue(expected contentEquals actual)
    }
}