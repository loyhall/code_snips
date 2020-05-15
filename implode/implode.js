// ATOMIC_FUNCTION: implode (delimiter,list)
// TAGS: string,list
// LANG:  node.js
// FUNCTION: implode (delimiter,list)
function implode(delimiter,list){
  return list.join(delimiter);
}
var start_val = ["hello","world"];
var expected_end_val = "hello world"
var end_val = implode(" ",start_val);

// TEST
if(JSON.stringify(end_val)==JSON.stringify(expected_end_val)){
    console.log('PASS');
}else{
	
    console.log('FAIL');
}
