// ATOMIC_FUNCTION: array.shift()
// TAGS: array
// LANG:  node.js
// FUNCTION: array.shift()

var start_val = ["orange", "banana", "apple", "raspberry"]
var expected_end_val = ["banana", "apple", "raspberry"]
start_val.shift();
var end_val = start_val;

// TEST
if(JSON.stringify(expected_end_val )==JSON.stringify(end_val)){
    console.log('PASS');
}else{
	console.log(end_val);
	
    console.log('FAIL');
}
