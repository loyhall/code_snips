<?php
// ATOMIC_FUNCTION:  md5($str)
// TAGS: string
// LANG:  php
// FUNCTION: md5($str)

$start_val = "apple";
$expected_end_val = '1f3870be274f6c49b3e31a0c6728957f';

$end_val = md5($start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
