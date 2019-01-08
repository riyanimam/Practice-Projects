<?php session_start();?>
<!DOCTYPE>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="Project2.css">
<title>Hangman</title>
</head>
<?php

$MAX_ATTEMPTS = 7;
$WORDLISTFILE = 'wordlist.txt';

    function fetchWordArray($wordFile)
    {
        $file = fopen($wordFile,'r');
           if ($file)
        {
            $random_line = null;
            $line = null;
            $count = 0;
            while (($line = fgets($file)) !== false) 
            {
                $count++;
                if(rand() % $count == 0) 
                {
                      $random_line = trim($line);
                }
        }
        if (!feof($file)) 
        {
            fclose($file);
            return null;
        }
        else 
        {
            fclose($file);
        }
    }
        $answer = str_split($random_line);
        return $answer;
    }

    function hideCharacters($answer)
    {
        $noOfHiddenChars = floor((sizeof($answer)/2) + 1);
        $count = 0;
        $hidden = $answer;
        while ($count < $noOfHiddenChars )
        {
            $rand_element = rand(0,sizeof($answer)-2);
            if( $hidden[$rand_element] != '_' )
            {
                $hidden = str_replace($hidden[$rand_element],'_',$hidden,$replace_count);
                $count = $count + $replace_count;
            }
        }
        return $hidden;
    }

    function checkAndReplace($userInput, $hidden, $answer)
    {
        $i = 0;
        $wrongGuess = true;
        while($i < count($answer))
        {
            if ($answer[$i] == $userInput)
            {
                $hidden[$i] = $userInput;
                $wrongGuess = false;
            }
            $i = $i + 1;
        }
        if (!$wrongGuess) 
            $_SESSION['attempts'] = $_SESSION['attempts'] - 1;
        return $hidden;
    }

    function checkGameOver($MAX_ATTEMPTS,$userAttempts, $answer, $hidden)
    {
        if ($userAttempts >= $MAX_ATTEMPTS)
            {
                echo "<h2>Game Over. The correct word was </h2>";
                foreach ($answer as $letter) echo $letter;
                echo '<br><form action = "" method = "post"><input type = "submit" name' + 
                  ' = "newWord" value = "Try another Word"/></form><br>';
                die();
            }
            if ($hidden == $answer)
            {
                echo "<h2>You got it! The correct word is indeed </h2>";
                foreach ($answer as $letter) echo $letter;
                echo '<br><form action = "" method = "post"><input ' + 
                  'type = "submit" name = "newWord" value = "Try another Word"/></form><br>';
                die();
            }
    }
?>
<body>
<table border="1" cellpadding="1" cellspacing="1">
  <tr>
    <th><a href="http://codd.cs.gsu.edu/~rimam1/index.html">Home Page</a></th>
    <th><a href="http://codd.cs.gsu.edu/~rimam1/Project2SignIn.html">Sign In Page</a></th>
    <th><a href="http://codd.cs.gsu.edu/~rimam1/Project2Leaders.php">Leaderboards</a></th>
  </tr>
</table>
<?php
    if (isset($_POST['newWord'])) unset($_SESSION['answer']);
    if (!isset($_SESSION['answer']))
    {
        $_SESSION['attempts'] = 0;
        $answer = fetchWordArray($WORDLISTFILE);
        $_SESSION['answer'] = $answer;
        $_SESSION['hidden'] = hideCharacters($answer);
        echo '<h2>Attempts remaining: '.($MAX_ATTEMPTS - $_SESSION['attempts']).'</h2><br>';
    }else
    {
        if (isset ($_POST['userInput']))
        {
            $userInput = $_POST['userInput'];
            $_SESSION['hidden'] = checkAndReplace(strtolower($userInput), $_SESSION['hidden'], $_SESSION['answer']);
            checkGameOver($MAX_ATTEMPTS,$_SESSION['attempts'], $_SESSION['answer'],$_SESSION['hidden']);
        }
        $_SESSION['attempts'] = $_SESSION['attempts'] + 1;
        echo '<h2>Attempts remaining: '.($MAX_ATTEMPTS - $_SESSION['attempts'])."</h2><br>";
    }
    $hidden = $_SESSION['hidden'];
    foreach ($hidden as $char) echo $char."  ";
?>

<form name = "inputForm" action = "" method = "post">
Your Guess: <input name = "userInput" type = "text" size="1" maxlength="1"  />
<input type = "submit"  value = "Check"/>
<input type = "submit" name = "newWord" value = "Try another Word"/>
</form>
</body>
</html>