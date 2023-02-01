<html>
<head>
<style>
body {
  font-family: 'Brush Script MT', cursive; 
  font-size: 30px;
  background-color: #f2ccff;
}
</style>
<title>Update Child</title>
</head>
<body>
<br><br>
<center>
<?php
$chname=$_POST["ch_name"];
$chsurname=$_POST["ch_surname"];
$chanimaltype=$_POST["ch_animaltype"];

echo("The name of the child:".$chname."<br>");
echo("The surname of the child:".$chsurname."<br>");
echo("The type of the companion:".$chanimaltype."<br>");

$server_nm = "DESKTOP-MRD81O3\SQLEXPRESS01";
$connection = array( "Database"=>"therapy", "UID"=>"andreea2", "PWD"=>"andreea2");
$conn = sqlsrv_connect( $server_nm, $connection);
$q2="Update Children SET Animal='$chanimaltype' WHERE Name='$chname'and Surname='$chsurname'";
$query2=sqlsrv_query($conn, $q2) or die ("Update Error");
echo("Successfully updated!");
?>
</center>
<center><img src="horse1.gif" alt="Dog" width="300" height="300"></center>
</body>
</html>