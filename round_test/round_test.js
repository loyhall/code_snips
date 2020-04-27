//Function:round
//Lang: node.js

var start_val=1.2;
var expected_end_val=1;
var end_val=Math.round(start_val,0);

//TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}