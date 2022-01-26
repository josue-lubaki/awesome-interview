package app

fun main() {
    val arr = mutableListOf(1,2,3,4,5,6,7)
    val d = 4

    // test Method
    print(rotateLeft(arr,d))
}

fun rotateLeft(arr: MutableList<Int>, d : Int): MutableList<Int> {
    val result : MutableList<Int> = mutableListOf()

    for (i in 0 until arr.size){
        result.add(arr[(i + d) % arr.size])
    }

    return result
}