// ATOMIC_FUNCTION: json_decode(x) 
// TAGS: json
// LANG:  node.js
// FUNCTION: json_decode(x) 
function json_decode(x) {
    return JSON.parse(x);
}
var start_val = '{"result":true, "count":42}';
var expected_end_val =42
var end_val = json_decode(start_val).count;

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
	
    console.log('FAIL');
}
