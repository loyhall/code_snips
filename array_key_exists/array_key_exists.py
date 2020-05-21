# ATOMIC_FUNCTION: array_key_exists (key,dic) 
# TAGS: dictionary
# LANG:  python
# FUNCTION: array_key_exists (key,dic) 
def array_key_exists (key,dic) :
	return key in dic

start_val_1 = {"first":1}
start_val_2 = "first"
expected_end_val = True

end_val = array_key_exists (start_val_2,start_val_1) 

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")







