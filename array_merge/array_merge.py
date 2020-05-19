# ATOMIC_FUNCTION: array_merge( first_array , second_array )
# TAGS: list
# LANG:  python
# FUNCTION: array_merge( first_array , second_array )
def array_merge( first_array , second_array ):
	if isinstance( first_array , list ) and isinstance( second_array , list ):
		return first_array + second_array
	elif isinstance( first_array , dict ) and isinstance( second_array , dict ):
		return dict( list( first_array.items() ) + list( second_array.items() ) )
	elif isinstance( first_array , set ) and isinstance( second_array , set ):
		return first_array.union( second_array )
	return False

start_val_1 = ["hello","world"]
start_val_2 = ["atomic"]
expected_end_val = ["hello","world","atomic"]

end_val = array_merge(start_val_1,start_val_2)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")







