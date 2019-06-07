<?php
    $dsn = 'mysql:host=localhost;dbname=bookcatalog';
    $username = 'php';
    $password = 'php';
    
    try{
        $db = new PDO($dsn, $username, $password);
    } catch (Exception $e) {
        $error_message = $e->getMessage();
        include('database_error.php');
        exit();
    }
?>