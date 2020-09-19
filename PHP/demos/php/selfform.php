<html>
<head>
    <title>Self Processing Form</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>

<body>
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
    Enter your name: <input type="text" name="name" />
    <input type="submit" />
</form>

<?php if(!empty($_POST['name']))
{
    echo "Greetings, {$_POST['name']}, and welcome to the U.S.S. Enterprise.";
} ?>

</body>
</html>
