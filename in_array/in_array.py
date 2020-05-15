
# ATOMIC_FUNCTION: in_array(value,array)
# TAGS: list
# LANG:  python
# FUNCTION: in_array(value,array)
def in_array(value,array):
	return value in array

start_val_1 = ["hello","world"]
start_val_2 = "hello"
expected_end_val = True

end_val = in_array(start_val_2,start_val_1)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")







