// ATOMIC FUNCTION:date
// TAGS: time
// LANG: node.js
// FUNCTION: date

var start_val=new Date().year.toString();
var expected_end_val="Sun May 31 2020 21:03:18 GMT-0700 (Pacific Daylight Time)";

var end_val=new Date().toString();;

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
	console.log(start_val);
    console.log('FAIL');
}
