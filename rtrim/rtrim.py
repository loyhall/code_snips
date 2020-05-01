
def rtrim(start_val,del_char=" "):
    return start_val.rstrip(del_char)


# ATOMIC_FUNCTION:  rtrim(val)
# TAGS: string
# LANG:  python
# FUNCTION: rtrim(val) 

start_val = "  abcdefg  "
expected_end_val = "  abcdefg"
end_val = rtrim(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





