package app

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(fibonacciFirstN(10))
            println(fibonacciListRecursion(10))
        }
    }
}

/**
 * Method to calculate the fibonacci number of a given number
 * @param n the number of elements in the fibonacci sequence
 * @return the MutableList of the fibonacci sequence
 */
fun fibonacciFirstN(n : Int) : MutableList<Int> {
    val list = mutableListOf<Int>()
    var a = 0
    var b = 1
    for (i in 0 until n) {
        list.add(a)
        val temp = a
        a = b
        b += temp
    }
    return list
}

/**
 * Method to calculate the fibonacci number using recursion
 * @param n the number of elements in the fibonacci sequence
 * @return the MutableList of the fibonacci sequence
 */
fun fibonacciListRecursion(n : Int) : MutableList<Int> {
    return when (n) {
        0 -> mutableListOf(0)
        1 -> mutableListOf(0)
        2 -> mutableListOf(0,1)
        else -> {
            val list: MutableList<Int> = fibonacciListRecursion(n - 1)
            list.add(list[list.size - 1] + list[list.size - 2])
            list
        }
    }

}