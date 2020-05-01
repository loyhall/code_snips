<?php
// ATOMIC_FUNCTION:  strlen($val)
// TAGS: string, int 
// LANG:  php
// FUNCTION: strlen($val) 

$start_val = "abcdefg";
$expected_end_val = 7;
$end_val = strlen($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
