// ATOMIC FUNCTION:cos
// TAGS: math，numeric
// LANG: node.js
// FUNCTION: Math.cos(val, precision)

var start_val=0;
var expected_end_val=1;

var end_val=Math.cos(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
