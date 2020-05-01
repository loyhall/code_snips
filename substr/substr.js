// ATOMIC_FUNCTION:  substr($val, $start, $length)
// TAGS: string
// LANG:  node.js
// FUNCTION: substr($val, $start, $length) 

var start_val = "abcdefg";
var expected_end_val = "bcd";
var start = 1;
var length = 3;
var end_val = start_val.substr(start,length);


// TEST
if(end_val == expected_end_val) {
	console.log("PASS");
} else {
	console.log("FAIL");
}