// ATOMIC_FUNCTION: array_key_exists(k,m)
// TAGS: map
// LANG:  node.js
// FUNCTION: array_key_exists(k,m)
function array_key_exists(k,m) {
   return m.has(k);
}
var start_val_1 = new Map();
start_val_1.set("first",1)
var start_val_2 = "first";
var expected_end_val = true;
var end_val = array_key_exists(start_val_2,start_val_1)

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
	
    console.log('FAIL');
}
