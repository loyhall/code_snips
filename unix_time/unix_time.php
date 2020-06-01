<?php
// ATOMIC_FUNCTION:  time()
// TAGS: time
// LANG:  php
// FUNCTION: time()

$start_val = time();
$expected_end_val ="1970-01-01";

$end_val = date("Y-m-d",$t);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
