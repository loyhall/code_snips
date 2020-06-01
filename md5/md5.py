# ATOMIC_FUNCTION:  md5(s)
# TAGS: string
# LANG:  python
# FUNCTION: md5(s)
import hashlib
import math
def md5(s):
    hl = hashlib.md5()
    hl.update(s.encode(encoding='utf-8'))
    return hl.hexdigest()
start_val = "apple"
expected_end_val = "1f3870be274f6c49b3e31a0c6728957f"

end_val = md5(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






