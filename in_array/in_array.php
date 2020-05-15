<?php
// ATOMIC_FUNCTION:  in_array ( mixed $needle , array $haystack [, bool $strict = FALSE ] ) 
// TAGS: array, Boolean
// LANG:  php
// FUNCTION: in_array ( mixed $needle , array $haystack [, bool $strict = FALSE ] ) 

$start_val_1 = array("hello","world");
$start_val_2 = "hello";
$expected_end_val = True;

$end_val = in_array($start_val_2,$start_val_1);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
