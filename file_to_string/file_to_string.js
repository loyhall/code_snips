// ATOMIC_FUNCTION: file_to_string(path)
// TAGS: file, string
// LANG:  node.js
// FUNCTION: file_to_string(path)

function file_to_string(path) {
    const fs = require('fs') 
	return fs.readFileSync(path, 'utf8');
}
var start_val_1 = "test.txt";
var expected_end_val = "hello world";
var end_val = file_to_string(start_val_1)

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
	console.log(end_val);
    console.log('FAIL');
}
