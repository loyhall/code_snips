// ATOMIC_FUNCTION:  strtolower(s)
// TAGS: string
// LANG:  node.js
// FUNCTION: strtolower(s)
function strtolower(s) {
    return s.toLowerCase();
}
var start_val = "HELLO";
var expected_end_val = "hello";
var end_val = strtolower(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
