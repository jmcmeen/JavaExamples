<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Strings In PHP</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>

<body>
<div class="jumbotron">
    <h1>Variable Interpolation</h1>
    <p>
        <?php
        $numberOfWeresquirrels = 42;
        echo "With double quotes - \$numberOfWeresquirrels is equal to $numberOfWeresquirrels";
        ?>
    </p>

    <p>
        <?php
        echo 'With single quotes - \$numberOfWeresquirrels is equal to $numberOfWeresquirrels';
        ?>
    </p>

    <p>
        <?php
        $verb = "howl";
        echo "Without curly braces (should generate error) - $verbing<br>";
        echo "With curly braces - {$verb}ing<br>";
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1> Escaping Characters in a Single-Quotation Marked String </h1>
    <p>
        <?php
        echo 'I\'m a monster!<br>';    // The \’ is escaped
        echo 'C:\\WINDOWS<br>';            // The \\ is escaped
        echo 'End this line with a carriage return\n<br>';    // Doesn’t work
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1> Boolean Ouput </h1>
    <p>
        <?php
        $howlingAtTheMoon = true;
        echo "The boolean value is $howlingAtTheMoon <br>\n";
        echo "The boolean value is ", $howlingAtTheMoon ? "true" : "false", "<br>\n";
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1>
        Examples of some heredocs
    </h1>
    <p>
        <?php
        $longString = <<< endOfBlock
					The output of this "heredoc"
					must be viewed in the html
					source in order to understand
					the full effect.
endOfBlock;
        echo $longString;
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1> printf() Example </h1>
    <p>
        <?php
        $floatingPointValue = 3.1415926535898;
        echo "echo of value is $floatingPointValue.<br>";
        printf("printf of value to two decimal points is %4.2f.<br>", $floatingPointValue);

        printf("The average grade is %5.2f%% across %d weresquirrels in %s.<br>", 95.23, $numberOfWeresquirrels, "Weresquirrel School");

        $integerValue = 42;
        printf("The decimal value %d in hex is %x.<br>", $integerValue, $integerValue);

        $red = 153;
        $green = 204;
        $blue = 255;
        printf("The web color for red = %d, green = %d, and blue = %d is 0x%06x.<br>", $red, $green, $blue, $blue + 256 * ($green + 256 * $red));
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1> strlen() and Offset Example </h1>
    <p>
        <?php
        $courseName = "Weresquirrel Apocalypse!!";
        for ($position = 0; $position < strlen($courseName); $position++) {
            printf("Position %d contains %s.<br>", $position, $courseName{$position});
        }
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1> Trim Demo </h1>
    <p>
        <?php
        $stringToTrim = "     42 Weresquirrels: the new threat to America     ";
        echo "Original string: \"$stringToTrim\"<br />\n";
        echo "trim with character default character mask: \"" . trim($stringToTrim) . "\"<br />\n";
        echo "ltrim with character default character mask: \"" . ltrim($stringToTrim) . "\"<br />\n";
        echo "rtrim with character default character mask: \"" . rtrim($stringToTrim) . "\"<br />\n";
        echo "trim with character character mask \" a..z\": \"" . trim($stringToTrim, "a..z") . "\"<br />\n";
        echo "trim with character character mask \" 0..9\": \"" . trim($stringToTrim, "0..9") . "\"<br />\n";
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1> htmlentities() and strip_tags() Demo </h1>
    <p>
        <?php
        $stringContainingHTML = "<em><strong>To prevent being attacked by a weresquirrel, one would be advised to never go unaccompanied outside during a half moon.</strong></em><br />";
        echo "\nRaw string - ", $stringContainingHTML;
        echo "<br />";
        echo "\nWith htmlentities() - ", htmlentities($stringContainingHTML);
        echo "<br />";
        echo "\nWith strip_tags() - ", strip_tags($stringContainingHTML);
        echo "<br />";
        ?>
    </p>
</div>

<div class="jumbotron">
    <h1> Comparing Strings </h1>
    <p>
        <?php
        $string1 = "hello world";
        $string2 = "hElLo WoRlD";
        $string3 = "hello";
        echo "strcmp() comparing $string1 and $string2 = ", strcmp($string1, $string2), "<br />";
        echo "strcmp() comparing $string1 and $string3 = ", strcmp($string1, $string3), "<br />";
        echo "strcmp() comparing $string3 and $string1 = ", strcmp($string3, $string1), "<br />";
        echo "strcmp() comparing $string1 and $string1 = ", strcmp($string1, $string1), "<br />";
        echo "strcasecmp() comparing $string1 and $string2 = ", strcasecmp($string1, $string2), "<br />";
        echo "strncmp() comparing first 3 characters of $string1 and $string2 = ", strncmp($string1, $string2, 3), "<br />";
        ?>
    </p>
</div>

</body>
</html>



