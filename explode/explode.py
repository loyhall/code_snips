# ATOMIC_FUNCTION:  explode (delimiter,string) 
# TAGS: string,list
# LANG:  python
# FUNCTION: explode (delimiter,string) 
def explode(delimiter,string):
	return string.split(delimiter)

start_val = "piece1 piece2 piece3 piece4 piece5 piece6"
expected_end_val = ["piece1","piece2","piece3","piece4","piece5","piece6"];

end_val = explode(" ",start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






