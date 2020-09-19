<!DOCTYPE html>
<html>
<head>
    <title>Dates in PHP</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>

<body>
    <h1 style="text-align:center">The current date is,
        <?php
            // set the default timezone before using date() function
            date_default_timezone_set('UTC');
            echo date("F j, Y");
        ?>
    </h1>
</body>
</html>
