package lv2class CountPrice {    fun solution(price: Int, money: Int, count: Int): Long {        var answer = (1..count).map { price * it }.sumOf { it.toLong() } - money        return if (answer < 0) 0 else answer    }}