<?php
// ATOMIC_FUNCTION: array_pop($a)
// TAGS: array
// LANG:  php
// FUNCTION: array_pop($a)

$start_val_1 = array("orange", "banana", "apple", "raspberry");
$expected_end_val = array("orange", "banana", "apple");
array_pop($start_val_1);
$end_val = $start_val_1;

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
