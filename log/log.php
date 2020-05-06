<?php
// ATOMIC_FUNCTION:  log($val)
// TAGS: math，numeric
// LANG:  php
// FUNCTION: log($val)

$start_val = exp(1);
$expected_end_val = 1;

$end_val = log($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
