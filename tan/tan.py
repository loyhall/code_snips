
# ATOMIC_FUNCTION:  tan(val)
# TAGS: math，numeric
# LANG:  python
# FUNCTION: tan(val)
import math
start_val = 0
expected_end_val = 0

end_val = math.tan(start_val)


# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





