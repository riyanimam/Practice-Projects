<!DOCTYPE>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="Project2.css">
<title>Hangman</title>
</head>
<body>
<table border="1" cellpadding="1" cellspacing="1">
  <tr>
    <th><a href="http://codd.cs.gsu.edu/~rimam1/index.html">Home Page</a></th>
    <th><a href="http://codd.cs.gsu.edu/~rimam1/Project2SignIn.html">Sign In Page</a></th>
  </tr>
</table>
<br>
<h2>Leaderboard</h2>
<br>
<?php
   $entries = array('John Doe' => '4', 
          'Jane Doe' => '10', 
          'Skinny Boi' => '12',);

echo '<table class = "box" width="300px" border="1" cellpadding="1" cellspacing="1">';
echo "<td>Name</td>";
echo "<td>Score</td>"; 


foreach($entries as $names => $score)
{
  echo "<tr>";
  echo "<td>$names</td>";
  echo "<td>$score</td>";        
}

echo "</tr>";
echo "</table>"; 
?>

</body>
</html>