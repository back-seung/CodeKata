package lv3class Threes {    fun solution(number: IntArray): Int {        var count = 0        var answer: Int = 0        for (i in number.indices) {            answer += number[i]            for (j in i + 1 until number.size) {                answer += number[j]                for (k in j + 1 until number.size) {                    if (answer + number[k] == 0) count++                }            }        }        return count    }}