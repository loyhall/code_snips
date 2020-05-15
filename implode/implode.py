
# ATOMIC_FUNCTION:  implode (string,list) 
# TAGS: string,list
# LANG:  python
# FUNCTION: implode (string,list) 
def implode(string,l):
	return string.join(l)

start_val = ["hello","world"]
expected_end_val = "hello world"

end_val = implode(" ",start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")







