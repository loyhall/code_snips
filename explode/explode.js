// ATOMIC_FUNCTION:  explode (delimiter,string)
// TAGS: string,list
// LANG:  node.js
// FUNCTION: explode (delimiter,string)
function explode(delimiter,string){
  return string.split(delimiter);
}
var start_val = "piece1 piece2 piece3 piece4 piece5 piece6";
var expected_end_val = ["piece1","piece2","piece3","piece4","piece5","piece6"];
var end_val = explode(" ",start_val);

// TEST
if(JSON.stringify(end_val)==JSON.stringify(expected_end_val)){
    console.log('PASS');
}else{
	
    console.log('FAIL');
}
