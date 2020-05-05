<?php
// ATOMIC_FUNCTION:  tan($val)
// TAGS: math，numeric
// LANG:  php
// FUNCTION: tan($val)

$start_val = 0;
$expected_end_val = 0;

$end_val = tan($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
