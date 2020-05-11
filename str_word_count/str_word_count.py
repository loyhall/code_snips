# ATOMIC_FUNCTION:  str_word_count(string)
# TAGS: string,int
# LANG:  python
# FUNCTION: str_word_count(string)
def str_word_count(string):
	a=string.split(" ")
	return len(a)

start_val = "hello world"
expected_end_val =2

end_val = str_word_count(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






