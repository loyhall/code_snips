// ATOMIC_FUNCTION: array.pop()
// TAGS: array
// LANG:  node.js
// FUNCTION: array.pop()

var start_val = ["orange", "banana", "apple", "raspberry"];
var expected_end_val = ["orange", "banana", "apple"];
start_val.pop();
var end_val = start_val;

// TEST
if(JSON.stringify(expected_end_val )==JSON.stringify(end_val)){
    console.log('PASS');
}else{
	console.log(end_val);
	
    console.log('FAIL');
}
