
# ATOMIC_FUNCTION:  exp(val)
# TAGS: math，numeric
# LANG:  python
# FUNCTION: exp(val)
import math

start_val = math.log(1)
expected_end_val = 1

end_val = math.exp(start_val)


# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")

