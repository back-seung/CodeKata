package lv1class RemoveMinNumber {    fun solution(arr: IntArray): IntArray {        if (arr.size == 1) return IntArray(1) { -1 }        val min = arr.minOrNull()        return arr.filter { it != min }.toIntArray()    }}fun main() {    println(RemoveMinNumber().solution(intArrayOf(4, 3, 2, 1)).contentToString())}