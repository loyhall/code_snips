<?php
// ATOMIC_FUNCTION:  ltrim($val)
// TAGS: string
// LANG:  php
// FUNCTION: ltrim($val) 

$start_val = "  abcdefg  ";
$expected_end_val = "abcdefg  ";
$end_val = ltrim($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
