# Given a string, return a new string made of every other
# char starting with the first, so "Hello" yields "Hlo".
def string_bits(str):
    result = ""
    for bit in range(len(str)):
        if bit % 2 == 0:
            result = result + str[bit]

    return result