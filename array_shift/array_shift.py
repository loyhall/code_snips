
# ATOMIC_FUNCTION: array_shift(array)
# TAGS: list
# LANG:  python
# FUNCTION: array_shift(array)
def array_shift(array):
    if len(array)>1:
        return array[1:]
    else:
        return None

start_val_1 = ["orange", "banana", "apple", "raspberry"]
expected_end_val = ["banana", "apple", "raspberry"]
end_val = array_shift(start_val_1)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")




