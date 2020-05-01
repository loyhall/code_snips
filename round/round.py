#!/usr/bin/env python
# coding: utf-8

# In[2]:


# ATOMIC FUNCTION: round
# TAGS: math，numeric
# LANG:python
# FUNCTION round(val, precision)

start_val=1.2
expected_end_val=1
precision=0
end_val=round(start_val,precision)

#Test
if(end_val==expected_end_val):
    print("PASS")

else:
    print("FAIL")


# In[ ]:




