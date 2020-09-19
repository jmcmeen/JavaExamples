<?php
/*
 * File name: arrays.php
 * Project name: Array Demonstration
 * Creation date: 9/19/2020
 */

//Arrays
//initialize numbers array, generate random numbers. These will be accessible at array indices 0,1,2,3,4,5
$numbers = array(rand (0,1000), rand (0,1000), rand (0,1000), rand (0,1000), rand (0,1000), rand (0,1000));

//Use print_r to view array (view page source to see the change after each source)
print_r($numbers);

//Sort array maintain index association
asort($numbers);
print_r($numbers);

//Reverse sort array maintain index association
arsort($numbers);
print_r($numbers);

//Associative Arrays
//Initialize a games array, each element in the array is another array (2d array)
//The sub arrays, have string indices (keys), instead of numeric, as defined below.
$games = array
(
    array(
        'title' => 'Asteroids',
        'platform' => '2600',
        'date' => 1980
    ),
    array(
        'title' => 'Mario Bros.',
        'platform' => 'NES',
        'date' => 1983,
        'genre' => 'Platformer'
    ),
    array(
        'title' => 'Sim City',
        'platform' => 'PC',
        'date' => 1988
    ),
    array(
        'title' => 'Tetris',
        'platform' => 'Game Boy',
        'date' => 1989
    )
);

//Print each game, checking to see if the key exists first
foreach ($games as $index => $game)
{
    //Ternary if example, checking to see if key exists
    echo "Title: ", array_key_exists('title', $game) ? $game['title'] : "N/A", "\n";

    //Regular if block
    if(array_key_exists('platform', $game))
    {
        echo "Platform: ", $game['platform'], "\n";
    }

    //Regular if block, notice genre only exists for one game
    if(array_key_exists('genre', $game))
    {
        echo "Genre: ", $game['genre'], "\n";
    }
    echo "\n";
}

//array_multisort — Sort multiple or multi-dimensional arrays
//create an array of game keys in the same order as the games sub array
//this will creat an array of all the titles
foreach ($games as $key => $game){
    $title[$key] = $game['title'];
}

//array_multisort will sort the titles array and apply the same changes to the $games array
//The titles array is a reference that tells array_multisort which key to sort on.
//Sort ascending by title
array_multisort($title, SORT_ASC, $games);
print_r($games);

//Sort descending by titles
array_multisort($title, SORT_DESC, $games);
print_r($games);

//Create a reference array with platform
foreach ($games as $key => $game){
    $platform[$key] = $game['platform'];
}
//Sort ascending by platform
array_multisort($platform, SORT_ASC, $games);
print_r($games);

?>