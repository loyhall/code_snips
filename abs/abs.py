
# ATOMIC_FUNCTION:  abs(val)
# TAGS: math，numeric
# LANG:  python
# FUNCTION: abs(val)

start_val = -1.2;
expected_end_val = 1.2;

end_val = abs(start_val);



# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")

