<?php
// ATOMIC_FUNCTION:  trim($val)
// LANG:  php
// FUNCTION: trim($val) 

$start_val = "  abcdefg  ";
$expected_end_val = "abcdefg";
$end_val = trim($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
