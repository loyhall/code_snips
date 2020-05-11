<?php
// ATOMIC_FUNCTION:  str_replace($search,$replace,$subject)
// TAGS: string
// LANG:  php
// FUNCTION: str_replace($search,$replace,$subject)

$start_val = "<body text='%body%'>";
$expected_end_val = "<body text='black'>";

$end_val = str_replace("%body%", "black", "<body text='%body%'>");

// TEST
if($end_val == $expected_end_val) {
	echo "PASS";
} else {
	
	echo "FAIL";
}

?>
