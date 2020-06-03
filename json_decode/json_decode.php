<?php
// ATOMIC_FUNCTION:  json_decode($json)
// TAGS: json
// LANG:  php
// FUNCTION: json_decode($json)

$start_val= '{"foo-bar": 12345}';
$obj = json_decode($start_val);
$end_val=$obj->{'foo-bar'}; 
$expected_end_val=12345;

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
