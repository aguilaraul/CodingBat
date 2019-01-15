# We have a loud talking parrot. The "hour" parameter is the
# current hour time in the range 0..23. We are in trouble if
# the parrot is talking and the hour is before 7 or after 20.
# Return True if we are in trouble
def parrot_trouble(talking, hour):
    return talking and (hour < 7 or hour > 20)

print(parrot_trouble(True, 6)) # true
print(parrot_trouble(True, 7)) # false
print(parrot_trouble(False, 6)) # false
print(parrot_trouble(True, 21)) # true
print(parrot_trouble(False, 21)) # false
print(parrot_trouble(False, 20)) # false
print(parrot_trouble(True, 23)) # true
print(parrot_trouble(False, 23)) # false
print(parrot_trouble(True, 20)) # false
print(parrot_trouble(False, 12)) # fasle
