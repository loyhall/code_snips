#!/usr/bin/env python
# coding: utf-8

# In[1]:


# ATOMIC_FUNCTION: file_to_string(path)
# TAGS: file,string
# LANG: python
# FUNCTION: file_to_string(path) 
def file_to_string(path)  :
    f = open(path,"r")
    string = f.read()
    return string

start_val_1 = "test.txt"
expected_end_val = "hello world"

end_val = file_to_string(start_val_1) 

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")








# In[ ]:




