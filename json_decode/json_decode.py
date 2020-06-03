#!/usr/bin/env python
# coding: utf-8

# In[3]:


# ATOMIC_FUNCTION: json_decode(jsonData)
# TAGS: json
# LANG:  python
# FUNCTION: json_decode(jsonData)
import json

def json_decode(jsonData):    
    
    return json.loads(jsonData)
start_val = '{"a":1,"b":2,"c":3,"d":4,"e":5}'
expected_end_val = {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5}
end_val =json_decode(start_val)


# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")






# In[ ]:




