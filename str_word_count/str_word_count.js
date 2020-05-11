// ATOMIC_FUNCTION:  str_word_count(String s)
// TAGS: string,int
// LANG:  node.js
// FUNCTION: str_word_count(String s)

function str_word_count(s){
  return s.split(" ").length;
}
var start_val = "hello world";
var expected_end_val = "2";
var end_val = str_word_count(start_val);

// TEST
if(end_val==expected_end_val){
    console.log('PASS');
}else{
    console.log('FAIL');
}
