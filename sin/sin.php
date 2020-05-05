<?php
// ATOMIC_FUNCTION:  sin($val)
// TAGS: math，numeric
// LANG:  php
// FUNCTION: sin($val)

$start_val = pi()/2;
$expected_end_val = 1;

$end_val = sin($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
