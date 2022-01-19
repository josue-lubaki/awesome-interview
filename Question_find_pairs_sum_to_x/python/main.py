""" 
    function 1 : find_pairs
    @param list : list of numbers
    @param sum : sum to find
    @return pairs : list of pairs
    @author : Josue Lubaki
"""
def find_pairs(list, sum):
    pairs = []
    for (i, a) in enumerate(list):
        for (_, b) in enumerate(list[i+1:]):
            if a + b == sum:
                pairs.append([a, b])
    return pairs


""" 
    function 2 : find_pairs_sum
    @param list : list of numbers
    @param sum : sum to find
    @return pairs : list of pairs
"""
def find_pairs_sum(list, sum):
    pairs = []
    for a in list:
        if sum - a in list:
            pairs.append([a, sum - a])
    return pairs


# test
list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(find_pairs(list, 15))  # [[5, 10], [6, 9], [7, 8]]
print(find_pairs_sum(list, 15))  # [[5, 10], [6, 9], [7, 8], [8, 7], [9, 6], [10, 5]]
