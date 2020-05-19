<?php
// ATOMIC_FUNCTION:  is_string( string $string )
// TAGS: string
// LANG:  php
// FUNCTION: is_string ( string $string )

$start_val = "HELLO";
$expected_end_val = true;

$end_val = is_string($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
