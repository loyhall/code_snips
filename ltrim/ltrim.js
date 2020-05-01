// ATOMIC_FUNCTION:  ltrim($val)
// TAGS: string
// LANG:  node.js
// FUNCTION: ltrim($val) 
function ltrim(str, chr) {
    var rgxtrim = (!chr) ? new RegExp('^\\s+') : new RegExp('^'+chr+'+');
    return str.replace(rgxtrim, '');
}

var start_val = "  abcdefg  ";
var expected_end_val = "abcdefg  ";
var end_val = ltrim(start_val);

// TEST
if(end_val == expected_end_val) {
	console.log("PASS");
} else {
	console.log("FAIL");
}
