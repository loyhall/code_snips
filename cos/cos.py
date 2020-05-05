
# ATOMIC_FUNCTION:  cos(val)
# TAGS: math，numeric
# LANG:  python
# FUNCTION: cos(val)
import math
start_val = 0
expected_end_val = 1

end_val = math.cos(start_val)


# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





