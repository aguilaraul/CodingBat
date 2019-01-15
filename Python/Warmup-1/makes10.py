# Given 2 ints, a and b, return True if one of thme is 10
# or if their sum is 10
def makes10(a,b):
    return a == 10 or b == 10 or a+b == 10

print(makes10(9,10)) # True
print(makes10(9,9)) # False
print(makes10(1,9)) # True
print(makes10(10,1)) # True
print(makes10(10,10)) # True
print(makes10(8,2)) # True
print(makes10(8,3)) # False
print(makes10(10,42)) # True
print(makes10(12,-2)) # True
