
def substr(start_val,start,length):
    return start_val[start:start+length]

# ATOMIC_FUNCTION:  substr(val, start, length)
# LANG:  python
# FUNCTION: substr(val, start, length) 

start_val = "abcdefg"
expected_end_val = "bcd"
start = 1
length = 3
end_val = substr(start_val,start,length)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





