<?php
// ATOMIC_FUNCTION:  array_merge(array1,array2)
// TAGS: array
// LANG:  php
// FUNCTION: array_merge(array1,array2)

$start_val_1 = array("color" => "red", 2, 4);
$start_val_2 = array("a", "b", "color" => "green", "shape" => "trapezoid", 4);
$expected_end_val = array
(
    "color" => "green",
    0 => 2,
    1 => 4,
    2 => a,
    3 => b,
    "shape" => "trapezoid",
    4 => 4
);

$end_val = array_merge($start_val_1,$start_val_2);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
