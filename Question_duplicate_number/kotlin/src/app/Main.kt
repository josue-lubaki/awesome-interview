package app

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // create list of integers
            val list = listOf(1, 2, 7, 3, 4, 5, 3, 4 ,7)
            print(findDuplicates(list)) // [3, 4, 7]
        }
    }
}

/** 
 * Function to find duplicates in a List
 * @param list List of integers
 * @return List of duplicates
 * @author Josue Lubaki
 * */ 
fun findDuplicatesByJosueLubaki(list: List<Int>): List<Int> {
    val duplicates = ArrayList<Int>()
    for (i in list.indices) {
        if (list.indexOf(list[i]) != i) {
            duplicates.add(list[i])
        }
    }
    return duplicates
}

/** 
 * Function to find duplicates in a List
 * @param list List of integers
 * @return List of duplicates
 * @author Josue Lubaki
 * */ 
fun findDuplicates(list: List<Int>): List<Int> {
    val duplicates = mutableSetOf<Int>()
    val seen = mutableSetOf<Int>()
    list.forEach {
        if (seen.contains(it)) {
            duplicates.add(it)
        } else {
            seen.add(it)
        }
    }
    return duplicates.toList()
}

/** 
 * Function to find duplicates in a List
 * @param list List of integers
 * @return List of duplicates
 * @author ???
 * */ 
// WRITE YOUR CODE HERE