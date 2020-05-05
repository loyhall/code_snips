<?php
// ATOMIC_FUNCTION:  cos($val)
// TAGS: math，numeric
// LANG:  php
// FUNCTION: cos($val)

$start_val = 0;
$expected_end_val = 1;

$end_val = cos($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
