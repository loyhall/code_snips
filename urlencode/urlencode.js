// ATOMIC FUNCTION: urlencode(s)
// TAGS: string
// LANG: node.js
// FUNCTION: urlencode(s)
function urlencode(s) {
  return encodeURIComponent(s);
}
var start_val = "mycgi?foo=";
var expected_end_val='mycgi%3Ffoo%3D';
var end_val=urlencode(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
