<?php
// ATOMIC_FUNCTION:  rtrim($val)
// TAGS: string
// LANG:  php
// FUNCTION: rtrim($val) 

$start_val = "  abcdefg  ";
$expected_end_val = "  abcdefg";
$end_val = rtrim($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
