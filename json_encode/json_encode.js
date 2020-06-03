// ATOMIC_FUNCTION: json_encode(x) 
// TAGS: json_encode
// LANG:  node.js
// FUNCTION: json_encode(x) 
function json_encode(x) {
    return JSON.stringify(x);
}
var start_val = { x: 5 };
var expected_end_val = '{"x":5}';
var end_val = json_encode(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
	
    console.log('FAIL');
}
