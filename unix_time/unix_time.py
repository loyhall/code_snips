
# ATOMIC_FUNCTION:  time.localtime()
# TAGS: time
# LANG:  python
# FUNCTION: time.localtime()
import time
start_val = str(time.localtime().tm_year)+"-"+str(time.localtime().tm_mon)+"-"+str(time.localtime().tm_mday)
expected_end_val = "2020-5-31"

end_val = str(time.localtime().tm_year)+"-"+str(time.localtime().tm_mon)+"-"+str(time.localtime().tm_mday)


# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





