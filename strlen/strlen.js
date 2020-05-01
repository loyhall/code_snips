// ATOMIC_FUNCTION:  strlen($val)
// TAGS: string, int
// LANG:  node.js
// FUNCTION: strlen($val) 

var start_val = "abcdefg";
var expected_end_val = 7;
var end_val = start_val.length;

// TEST
if(end_val == expected_end_val) {
	console.log("PASS");
} else {
	console.log("FAIL");
}