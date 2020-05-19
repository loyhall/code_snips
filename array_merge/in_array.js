// ATOMIC_FUNCTION: array_merge(array1,array2)
// TAGS: array
// LANG:  node.js
// FUNCTION: array_merge(array1,array2)
function array_merge(array1,array2) {
    return array1.concat(array2);
}
var start_val_1 = ["hello","world"];
var start_val_2 = ["atomic"];
var expected_end_val = ["hello","world","atomic"];
var end_val = array_merge(start_val_1,start_val_2);

// TEST
if(JSON.stringify(end_val)==JSON.stringify(expected_end_val)){
    console.log('PASS');
}else{
    console.log('FAIL');
}
