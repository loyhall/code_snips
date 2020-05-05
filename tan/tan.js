// ATOMIC FUNCTION:tan
// TAGS: math，numeric
// LANG: node.js
// FUNCTION: Math.tan(val, precision)

var start_val=0;
var expected_end_val=0;

var end_val=Math.tan(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
