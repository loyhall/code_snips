<?php
// ATOMIC_FUNCTION:  exp($val)
// TAGS: math，numeric
// LANG:  php
// FUNCTION: exp($val)

$start_val = log(1);
$expected_end_val = 1;

$end_val = exp($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
