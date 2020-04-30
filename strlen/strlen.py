
def strlen(val):
    return len(val)

# ATOMIC_FUNCTION:  strlen(val)
# LANG:  python
# FUNCTION: strlen(val) 

start_val = "abcdefg"
expected_end_val = 7
end_val = strlen(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")




