// ATOMIC FUNCTION:exp
// TAGS: math，numeric
// LANG: node.js
// FUNCTION: Math.exp(val)

var start_val=Math.log(1);
var expected_end_val=1;

var end_val=Math.exp(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
