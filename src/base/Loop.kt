package base

import java.lang.Integer.parseInt

// if是一个表达式，即它会返回一个值, 最后的表达式会作为 if 分支块的值
fun max(a: Int, b: Int): Int {
    val max = if(a > b) {
        println(a)
        a
    } else {
        println(b)
        b
    }
    return max
}


fun switch(a: Int) {
    val s = "5"
    // when 将它的参数和所有的分支条件顺序比较，直到某个分支满足条件, 和 if 一样可以作为表达式
    when (a) {
        1 -> println("1")
        2 -> println("2")
        3, 4 -> println("3 or 4")
        parseInt(s) -> print("s encodes x")
        in 10..20 -> print("10 - 20")
        !in 20..30 -> print("20..30")

        else -> {
            print("else")
        }
    }
}


fun forLoop() {
    // 循环 [0, 7]
    for (i in 0..7) {
        print("$i ,")
    }
    println()

    // 循环 [0, 7)
    for (i in 0 until 7) {
        print("$i ,")
    }
    println()

    var ints = intArrayOf(0, 1, 2, 3, 4, 5)
    for (item: Int in ints) {
        println(ints)
    }



}

fun whileLoop() {
    var x = 0;
    // while 和 do..while 照常使用
    while (x > 0) {
        x--
    }

    do {
        val y = "a"
    } while (y == "a") // y 在此处可见
}

fun main(args: Array<String>) {
    forLoop()
    max(1, 2)
    switch(5)
}