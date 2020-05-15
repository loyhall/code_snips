<?php
// ATOMIC_FUNCTION:  implode ( string $glue , array $pieces ) 
// TAGS: string,list
// LANG:  php
// FUNCTION: implode ( string $glue , array $pieces ) 

$start_val = array("hello","world");
$expected_end_val = "hello world";

$end_val = implode(" ", $start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	echo "FAIL";
}

?>
