<?php
// ATOMIC_FUNCTION:  str_word_count (string $string) 
// TAGS: string,int
// LANG:  php
// FUNCTION: str_word_count (string $string) 

$start_val = "hello world";
$expected_end_val = 2;

$end_val = str_word_count(start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
