package app

import java.util.*

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // create list of strings
            val s1 = "abcC"
            val s2 = "BcCa"
            val s3 = "CAbc"
            val list = listOf(s1, s2, s3)
            println(isAnagramByJosueLubaki(list))  // true
            println(isAnagramSortedSetByJosueLubaki(list))  // true
            println(isAnagramByJosueLubaki(s1, s2))  // true
            // ADD YOUR METHOD HERE
        }

        /**
         * Function to check if two strings are anagrams
         * @param s1 first string
         * @param s2 second string
         * @return true if strings are anagrams, false otherwise
         * @author Josue Lubaki
         * */
        private fun isAnagramByJosueLubaki(s1 : String, s2 : String) : Boolean {
            return s1.lowercase().toSortedSet() == s2.lowercase().toSortedSet()
        }

        /**
         * Function to check if all the strings in the array are anagrams of each other
         * @param list List of strings
         * @return true if all the strings are anagrams of each other
         *        false if not
         * @author Josue Lubaki
         */
        private fun isAnagramByJosueLubaki(list: List<String>): Boolean {
            if (list.isEmpty()) return false

            val map = mutableMapOf<Char, Int>()

            list.forEach { str : String ->
                for (c in str){
                    val ch = c.lowercaseChar()
                    if (map.containsKey(ch)) {
                        map[ch] = map[ch]!! + 1
                    } else {
                        map[ch] = 1
                    }
                }
            }

            for (c in map) {
                if (c.value % list.size != 0) {
                    return false
                }
            }
            
            return true
        }

        /**
         * Function to check if all the strings in the array are anagrams of each other
         * @param list List of strings
         * @return true if all the strings are anagrams of each other
         *        false if not
         * @author Josue Lubaki
         */
        private fun isAnagramSortedSetByJosueLubaki(list: List<String>): Boolean {
            if (list.isEmpty()) return false

            val map = mutableMapOf<SortedSet<Char>, Int>()

            list.forEach { str : String ->
                val r : SortedSet<Char> = str.lowercase().toSortedSet()
                if(map.containsKey(r))
                    map[r] = map[r]!! + 1
                else
                    map[r] = 1
            }

            for (r in map) {
                if (r.value % list.size != 0) {
                    return false
                }
            }

            return true
        }


        /**
         * Function to check if two strings are anagrams
         * @param s1 first string
         * @param s2 second string
         * @return true if strings are anagrams, false otherwise
         * @author ???
         * */
        // WRITE YOUR CODE HERE


    }
}