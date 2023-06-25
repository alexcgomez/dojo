<?php

namespace laracasts;

class Database
{
    public $connection;

    public function __construct(array $config)
    {
        $this->connection = new PDO(
            "mysql:host={$config['host']};port={$config['port']};dbname={$config['name']};charset={$config['charset']}",
            $config['user'],
            $config['pass']
        );
    }

    public function query($sql)
    {
        $statement = $this->connection->prepare($sql);
        $statement->execute();

        return $statement->fetchAll();
    }
}