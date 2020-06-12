# ATOMIC_FUNCTION:  urldecode(s)
# TAGS: string
# LANG:  python
# FUNCTION: urldecode(s)
import urllib
def urdecode(s):
    return urllib.parse.unquote(s)
start_val = 'mycgi%3Ffoo%3D'
expected_end_val = "mycgi?foo="

end_val = urdecode(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")
