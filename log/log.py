
# ATOMIC_FUNCTION:  log(val)
# TAGS: math，numeric
# LANG:  python
# FUNCTION: log(val)
import math

start_val = math.exp(1)
expected_end_val = 1

end_val = math.log(start_val)


# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")

