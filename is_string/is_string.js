// ATOMIC_FUNCTION:  is_string(s)
// TAGS: string, Boolean
// LANG:  node.js
// FUNCTION: is_string(s)
function is_string(s) {
    return (typeof s == 'string');
}
var start_val = "HELLO";
var expected_end_val = true;
var end_val = is_string(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
