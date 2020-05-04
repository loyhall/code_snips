#!/usr/bin/env python
# coding: utf-8

# In[2]:


# ATOMIC_FUNCTION:  floor(val)
# TAGS: math，numeric
# LANG:  python
# FUNCTION: floor(val)
import math
start_val = 1.2;
expected_end_val = 1;

end_val = math.floor(start_val);



# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")


# In[ ]:




