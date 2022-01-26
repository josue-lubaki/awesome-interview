package app

fun main(){
    val list : List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11)
    val target = 7
    print("index of $target value is ${binarySearch(list, target)}") // index of 7 value is 6
}


/**
 * Binary Search Method
 * @param list list of numbers
 * @param target number to search
 * @return Index of target otherwise -1
 * */
fun binarySearch(list: List<Int>, target: Int) : Int{
    return binarySearchHelper(list, target, 0, list.size)
}


/**
 * Binary Search Method
 * @param list list of numbers
 * @param target number to search
 * @param start index of the first element in the list
 * @param end index of the last element in the list
 * @return Index of target otherwise -1
 * */
fun binarySearchHelper(list: List<Int>, target: Int, start: Int, end: Int): Int {
    // Find Middle index of list
    val middle : Int = (start + end) / 2

    return if(start == end)
        -1
    else if(list[middle] > target)
        binarySearchHelper(list, target, start, middle)
    else if(list[middle] < target)
        binarySearchHelper(list, target, middle + 1, end)
    else middle
}
