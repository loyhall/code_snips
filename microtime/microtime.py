# ATOMIC_FUNCTION:  microtime ()
# TAGS: time
# LANG:  python
# FUNCTION: microtime ()
import time
start_val = time.time()
time.sleep(0.1)
time_end = time.time()
end_val = time_end - start_val

# TEST
if(end_val > 0 and end_val < 1):
    print("PASS")
else:
    print("FAIL")




