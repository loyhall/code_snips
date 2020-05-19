<?php
// ATOMIC_FUNCTION:  strtolower ( string $string )
// TAGS: string
// LANG:  php
// FUNCTION: strtolower ( string $string )

$start_val = "HELLO";
$expected_end_val = "hello";

$end_val = strtolower($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
