// ATOMIC_FUNCTION: in_array(needle, haystack)
// TAGS: array
// LANG:  node.js
// FUNCTION: in_array(needle, haystack)
function in_array(needle, haystack) {
    var length = haystack.length;
    for(var i = 0; i < length; i++) {
        if(haystack[i] == needle) return true;
    }
    return false;
}
var start_val_1 = ["hello","world"];
var start_val_2 = "hello";
var expected_end_val = true;
var end_val = in_array(start_val_2,start_val_1);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
	
    console.log('FAIL');
}
