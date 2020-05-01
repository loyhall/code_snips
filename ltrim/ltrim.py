def ltrim(start_val,del_char=" "):
    return start_val.lstrip(del_char)


# ATOMIC_FUNCTION:  ltrim(val)
# TAGS: string
# LANG:  python
# FUNCTION: ltrim(val) 

start_val = "  abcdefg  "
expected_end_val = "abcdefg  "
end_val = ltrim(start_val)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





