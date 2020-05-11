// ATOMIC_FUNCTION:  replaceAll(old,new)
// TAGS: string
// LANG:  node.js
// FUNCTION: replaceAll(old,new)

var start_val = "<body text='%body%'>";
var expected_end_val = "<body text='black'>";
var end_val = start_val.replace("%body%", "black");

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
