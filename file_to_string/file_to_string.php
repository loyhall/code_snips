<?php
// ATOMIC_FUNCTION:  file_get_contents(path)
// TAGS: file, string
// LANG:  php
// FUNCTION: file_get_contents(path)

$start_val_1= "test.txt";
$expected_end_val = "hello world";

$end_val = file_get_contents($start_val_1);
// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
