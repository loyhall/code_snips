<?php
// ATOMIC_FUNCTION:  json_encode($arr)
// TAGS: array, json
// LANG:  php
// FUNCTION: json_encode($arr)

$start_val_1 = array ('a'=>1,'b'=>2,'c'=>3,'d'=>4,'e'=>5);

$expected_end_val = '{"a":1,"b":2,"c":3,"d":4,"e":5}';

$end_val = json_encode($start_val_1);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
