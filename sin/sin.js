// ATOMIC FUNCTION:abs
// TAGS: math，numeric
// LANG: node.js
// FUNCTION: Math.abs(val, precision)

var start_val=Math.PI/2;
var expected_end_val=1;

var end_val=Math.sin(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
