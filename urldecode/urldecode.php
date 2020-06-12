<?php
// ATOMIC_FUNCTION:  urldecode($str)
// TAGS: string
// LANG:  php
// FUNCTION: urldecode($str)

$start_val = 'mycgi%3Ffoo%3D';
$expected_end_val = "mycgi?foo=";

$end_val = urldecode($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo $end_val;
	echo "FAIL";
}

?>
