# ATOMIC_FUNCTION:  urlencode(s)
# TAGS: string
# LANG:  python
# FUNCTION: urlencode(s)
import urllib
def urlencode(s):
    return urllib.parse.quote_plus(s)
start_val = "mycgi?foo="
expected_end_val = 'mycgi%3Ffoo%3D'

end_val = urlencode(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






