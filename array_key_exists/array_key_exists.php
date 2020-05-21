<?php
// ATOMIC_FUNCTION:  array_key_exists ( mixed $key , array $array ) 
// TAGS: array, Boolean
// LANG:  php
// FUNCTION: array_key_exists ( mixed $key , array $array ) 

$start_val_1= array('first' => 1);
$start_val_2 = "first";
$expected_end_val = True;

$end_val = array_key_exists($start_val_2, $start_val_1);
// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
