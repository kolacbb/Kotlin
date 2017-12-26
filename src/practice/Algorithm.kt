package practice

/**
 * merge two shorted array
 */
fun merge(a: IntArray, b: IntArray): IntArray {
    var pa = 0
    var pb = 0
    var answer = IntArray(a.size + b.size)
    for (i in 0 until a.size + b.size) {
        if (pa < a.size && pb < b.size) {
            if (a[pa] < b[pb]) {
                answer[i] = a[pa++]
            } else {
                answer[i] = b[pb++]
            }
        } else if (pa < a.size) {
            answer[i] = a[pa++]
        } else {
            answer[i] = b[pb++]
        }
    }
    return answer
}

/**
 * merge num2 into num1 as one sorted array.
 */
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var m = m - 1
    var n = n - 1
    for (i in (nums1.size - 1) downTo 0) {
        if (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m--]
            } else {
                nums1[i] = nums2[n--]
            }
        } else if (m >= 0) {
            nums1[i] = nums1[m--]
        } else {
            nums1[i] = nums2[n--]
        }
    }
}


fun main(args: Array<String>) {
    val answer = merge(intArrayOf(1, 2, 5), intArrayOf(0, 3, 4, 5, 6, 8, 9))
    for (index in 0 until answer.size) {
        print("${answer[index]}, ")
    }

    println()

    val num1 = intArrayOf(0, 3, 4, 5, 6, 8, 9, -1, -1, -1)
    merge(num1, 7, intArrayOf(1, 2, 5), 3)
    for (index in 0 until num1.size) {
        print("${num1[index]}, ")
    }
}