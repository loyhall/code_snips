
# ATOMIC_FUNCTION: is_array(value)
# TAGS: list
# LANG:  python
# FUNCTION: is_array(value)
def is_array(value):
	return isinstance(value, list)

start_val = ["hello","world"]
expected_end_val = True

end_val = is_array(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")







