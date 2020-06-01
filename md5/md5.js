// ATOMIC FUNCTION:abs
// TAGS: math，numeric
// LANG: node.js
// FUNCTION: Math.abs(val, precision)
var start_val = "apple";
var crypto = require('crypto');
var expected_end_val="1f3870be274f6c49b3e31a0c6728957f";
var end_val=crypto.createHash('md5').update(start_val).digest("hex");

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
