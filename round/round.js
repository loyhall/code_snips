// ATOMIC FUNCTION:round
// LANG: node.js
// FUNCTION: Math.round(val, precision)

var start_val=1.2;
var expected_end_val=1;
var precision=0;
var end_val=Math.round(start_val,precision);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
