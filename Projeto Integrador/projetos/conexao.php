<?php
try {
    $host = 'localhost;charset=utf8';
    $dbnm = '';
    $user = 'root';
    $pass = '';
    $dbh = new PDO('mysql:host='.$host.';dbname=newspaper'.$dbnm, $user, $pass);
} catch (PDOException $e) {
    print "Error!: " . $e->getMessage() . "<br/>";
    die();
}
?>