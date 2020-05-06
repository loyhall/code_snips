// ATOMIC FUNCTION:log
// TAGS: math，numeric
// LANG: node.js
// FUNCTION: Math.log(val)

var start_val=Math.exp(1);
var expected_end_val=1;

var end_val=Math.log(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
