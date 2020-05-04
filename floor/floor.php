<?php
// ATOMIC_FUNCTION:  floor($val)
// TAGS: math，numeric
// LANG:  php
// FUNCTION: floor($val)

$start_val = 1.2;
$expected_end_val = 1;

$end_val = floor($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
