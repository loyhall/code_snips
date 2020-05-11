<?php
// ATOMIC_FUNCTION:  explode ( string $delimiter , string $string [, int $limit ] ) 
// TAGS: string,list
// LANG:  php
// FUNCTION: explode ( string $delimiter , string $string [, int $limit ] ) 

$start_val = "piece1 piece2 piece3 piece4 piece5 piece6";
$expected_end_val = array("piece1","piece2","piece3","piece4","piece5","piece6");

$end_val = explode(" ", $start_val);

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
