#The parameter weekday is True if it is a weekday, and the parameter
# vacation is True if we are on vacation. We sleep in if it is not a weekday
# or we're on vacation. Return True if we sleep in.
def sleep_in(weekday, vacation):
    return not weekday or vacation

print (sleep_in(False, False)) #true
print (sleep_in(True, False)) #false
print (sleep_in(False, True)) #true
print (sleep_in(True, True)) #true
