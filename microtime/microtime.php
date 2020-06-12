<?php
// ATOMIC_FUNCTION: microtime ()
// TAGS: time
// LANG: php
// FUNCTION: microtime ()
$start_val = microtime(true);
// Sleep for 100 microseconds
usleep(100);
$time_end = microtime(true);
$end_val = $time_end - $start_val;
if(is_numeric($end_val) && is_float($end_val) && $end_val > 0 && $end_val < 1) {
    echo "PASS";
} else {
    echo "FAIL";
}
?>
