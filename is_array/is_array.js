// ATOMIC_FUNCTION: is_array(obj)
// TAGS: array
// LANG:  node.js
// FUNCTION: is_array(obj)
function is_array(obj){
  return Array.isArray(obj)

}
var start_val = ["hello","world"];
var expected_end_val = true;
var end_val = is_array(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
	
    console.log('FAIL');
}
