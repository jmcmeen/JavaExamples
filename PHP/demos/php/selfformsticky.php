<html>
<head>
    <title>Self Processing Sticky Form</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>
<body>
<form action="<?php $_SERVER['PHP_SELF']; ?>" method="post">

    <p><b>Your Name : </b><input type="text" name="name" value="<?php if(isset($_POST['name'])) echo $_POST['name'];?>" /></p>

    <p><b>Your Description : </b><br />
        <textarea name="description"><?php if(isset($_POST['description'])) echo $_POST['description'];?></textarea>

    <p><input type="submit" name="submit" value="submit" /></p>

    <?php
        if( empty($_POST['name']) || empty($_POST['description']))
        {
            echo "Please enter both name and description!";
        } else {

            echo "You entered <br> Name: {$_POST['name']} <br> Description: {$_POST['name']}";
        }
    ?>
</form>
</body>
</html>