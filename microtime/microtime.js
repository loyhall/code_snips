// ATOMIC FUNCTION:microtime() 
// TAGS: time
// LANG: node.js
// FUNCTION: microtime() 
function microtime() {
    var date  = new Date();
	var timestamp = Math.round(date.getTime()/1000 | 0); 
	return timestamp;
}
function sleep (time) {
  return new Promise((resolve) => setTimeout(resolve, time));
}


var start_val=microtime();
sleep(1000).then(() => {
    // Do something after the sleep!
var end_time=microtime();

var end_val=end_time-start_val;

// TEST
if(end_val>0 && end_val<10){
    console.log('PASS');
}else{

    console.log('FAIL');
}

});
