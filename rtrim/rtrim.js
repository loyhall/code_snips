// ATOMIC_FUNCTION:  rtrim($val)
// LANG:  node.js
// FUNCTION: rtrim($val) 
function rtrim(str, chr) {
    var rgxtrim = (!chr) ? new RegExp('\\s+$') : new RegExp(chr+'+$');
    return str.replace(rgxtrim, '');
}
var start_val = "  abcdefg  ";
var expected_end_val = "  abcdefg";
var end_val = rtrim(start_val);

// TEST
if(end_val == expected_end_val) {
	console.log("PASS");
} else {
	console.log("FAIL");
}
