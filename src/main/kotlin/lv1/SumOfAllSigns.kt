package lv1class SumOfAllSigns {    fun solution(absolutes: IntArray, signs: BooleanArray): Int {        var answer: Int = 0        signs.forEachIndexed { index, sign ->            answer += when (sign) {                true -> absolutes[index]                false -> absolutes[index] * -1            }        }        return answer    }}