// ATOMIC FUNCTION: urldecode(s)
// TAGS: string
// LANG: node.js
// FUNCTION: urldecode(s)
function urldecode(s) {
  return decodeURIComponent(s);
}
var start_val = 'mycgi%3Ffoo%3D';
var expected_end_val="mycgi?foo=";
var end_val=urldecode(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
