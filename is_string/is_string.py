# ATOMIC_FUNCTION:  is_string(s)
# TAGS: string,boolean
# LANG:  python
# FUNCTION: is_string(s)
def is_string(s):
	return isinstance(s,str)

start_val = "HELLO"
expected_end_val = True

end_val = is_string(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






