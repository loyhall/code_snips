
# ATOMIC_FUNCTION: array_pop(array)
# TAGS: list
# LANG:  python
# FUNCTION: array_pop(array)
def array_pop(array):
    n=len(array)
    if len(array)>1:
        return array[0:n-1]
    else:
        return None

start_val_1 = ["orange", "banana", "apple", "raspberry"]
expected_end_val = ["orange", "banana", "apple"]
end_val = array_pop(start_val_1)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")