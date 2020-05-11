# ATOMIC_FUNCTION:  str.replace(old, new[, max])
# TAGS: string
# LANG:  python
# FUNCTION: str.replace(old, new[, max])

start_val = "<body text='%body%'>"
expected_end_val = "<body text='black'>"

end_val = start_val.replace("%body%","black")

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






