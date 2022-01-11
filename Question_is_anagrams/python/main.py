"""
    function 1 : is anagrams function
    @param s1 : first string
    @param s2 : second string
    @return boolean
    @author : Josue Lubaki
"""
def is_anagrams(s1, s2):
    return set(s1.lower()) == set(s2.lower())


"""
    function 2 : is anagrams function
    @param s1 : first string
    @param s2 : second string
    @return boolean
    @author : Josue Lubaki
"""
def is_anagrams_by_josueLubaki(s1, s2):
    return sorted(s1.lower()) == sorted(s2.lower())


print(is_anagrams("abc", "BaC"))  # True
