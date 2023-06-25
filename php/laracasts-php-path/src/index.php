<?php

use laracastsrequire 'Database.php';
$config =require 'config.php';

$db = new Database($config['database']);

$users = $db->query('SELECT * FROM users');

foreach ($users as $user) {
    echo "<li>{$user['full_name']}</li>";
}


