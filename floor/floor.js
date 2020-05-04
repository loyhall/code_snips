// ATOMIC FUNCTION:floor
// TAGS: math，numeric
// LANG: node.js
// FUNCTION: Math.floor(val)

var start_val=1.2;
var expected_end_val=1;

var end_val=Math.floor(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
