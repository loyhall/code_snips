<?php
// ATOMIC_FUNCTION:  urlencode($str)
// TAGS: string
// LANG:  php
// FUNCTION: urlencode($str)

$start_val = "mycgi?foo=";
$expected_end_val = 'mycgi%3Ffoo%3D';

$end_val = urlencode($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo $end_val;
	echo "FAIL";
}

?>
