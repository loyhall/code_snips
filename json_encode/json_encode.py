# ATOMIC_FUNCTION: json_encode(dic)
# TAGS: json, dictionary
# LANG:  python
# FUNCTION: json_encode(dic)
import json

def json_encode(dic):    
    formatted_obj = json.dumps(dic, indent=4, separators=(',', ': '))
    return dic
start_val_1 = { 'a': 4, 'b': 5 }

expected_end_val = {'a': 4, 'b': 5}

end_val =json_encode(start_val_1)

# TEST
if(end_val == expected_end_val):
    print("PASS")
else:
    print("FAIL")





