<?php
// ATOMIC_FUNCTION:  round($val, $precision)
// TAGS: math，numeric
// LANG:  php
// FUNCTION: round($val, $precision)

$start_val = 1.2;
$expected_end_val = 1;
$precision = 0;
$end_val = round($start_val,$precision);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
