
# ATOMIC_FUNCTION:  sin(val)
# TAGS: math，numeric
# LANG:  python
# FUNCTION: sin(val)
import math
start_val = math.pi/2
expected_end_val = 1

end_val = math.sin(start_val)


# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





