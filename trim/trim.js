// ATOMIC_FUNCTION:  trim($val)
// LANG:  node.js
// FUNCTION: trim($val) 

var start_val = "  abcdefg  ";
var expected_end_val = "abcdefg";
var end_val = start_val.trim();

// TEST
if(end_val == expected_end_val) {
	console.log("PASS");
} else {
	console.log("FAIL");
}
