
def trim(start_val,del_char=" "):
    return start_val.strip(del_char)


# ATOMIC_FUNCTION:  trim(val)
# TAGS: string
# LANG:  python
# FUNCTION: trim(val) 

start_val = "  abcdefg  "
expected_end_val = "abcdefg"
end_val = trim(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






