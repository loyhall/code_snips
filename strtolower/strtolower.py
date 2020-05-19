# ATOMIC_FUNCTION:  strtolower(s)
# TAGS: string
# LANG:  python
# FUNCTION: strtolower(s)
def strtolower(s):
	return s.lower()

start_val = "HELLO"
expected_end_val = "hello"

end_val = strtolower(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






