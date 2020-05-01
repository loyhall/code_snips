<?php
// ATOMIC_FUNCTION:  substr($val, $start, $length)
// TAGS: string
// LANG:  php
// FUNCTION: substr($val, $start, $length) 

$start_val = "abcdefg";
$expected_end_val = "bcd";
$start = 1;
$length = 3;
$end_val = substr($start_val,$start, $length);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
