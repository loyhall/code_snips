<?php
// ATOMIC_FUNCTION:  is_array ($value) 
// TAGS: array
// LANG:  php
// FUNCTION: is_array ($value) 

$start_val = array("hello","world");
$expected_end_val = True;

$end_val = is_array($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
