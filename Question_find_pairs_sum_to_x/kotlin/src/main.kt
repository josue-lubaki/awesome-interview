package src

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // create list of integers
            val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) as MutableList<Int>
            println(find_pairs(list, 10)) // [(1, 9), (2, 8), (3, 7), (4, 6), (5, 5), (6, 4), (7, 3), (8, 2), (9, 1)]
            println(find_pairs_sum(list, 10)) // [(2, 8), (3, 7), (4, 6), (9, 1)]
        }
    }
}

/** 
 * Function to find pairs of integers in a list that sum up to a given value
 * @param list List of integers
 * @param sum Value to sum up to
 * @return List of pairs of integers
 * @author Josue Lubaki
 * */ 
fun find_pairs(list: MutableList<Int>, sum: Int): List<Pair<Int, Int>> {
    val pairs : MutableList<Pair<Int, Int>> = mutableListOf()
    list.forEachIndexed { _, pair ->
        list.forEachIndexed { _, pair2 ->
            if (pair + pair2 == sum) {
                pairs.add(Pair(pair, pair2))
            }
        }
    }
    return pairs
}

/** 
 * Function to find pairs of integers in a list that sum up to a given value
 * @param list List of integers
 * @param sum Value to sum up to
 * @return List of pairs of integers
 * @author Josue Lubaki
 * */ 
fun find_pairs_sum(list: MutableList<Int>, sum: Int): List<Pair<Int, Int>> {
    val pairs : MutableList<Pair<Int, Int>> = mutableListOf()

    for(i in 1 until list.size){
        for(j in 0 until list.size - i){
            if(i == j)
                continue

            if(list[i] + list[j] == sum){

                val newPair = Pair(list[i], list[j])

                if(newPair !in pairs && newPair.copy(newPair.second, newPair.first) !in pairs)
                    pairs.add(newPair)
            }
        }
    }
    return pairs
}