<html>
<head>
<style>
body {
 font-family: 'Brush Script MT', cursive; 
  font-size: 30px;
  background-color: #f2ccff;
}
</style>
<title>Delete Child</title>
</head>
<body>
<br><br><br>
<center>
<?php
$chid=$_POST["ch_id"];

echo("Child ID:".$chid."<br>");

$server_nm = "DESKTOP-MRD81O3\SQLEXPRESS01";
$connection = array( "Database"=>"therapy", "UID"=>"andreea2", "PWD"=>"andreea2");
$conn = sqlsrv_connect( $server_nm, $connection);
$q3="Delete FROM Children WHERE Child_Id='$chid';";
$query3=sqlsrv_query($conn, $q3) or die ("Deleting Error");
echo("Successfully deleted!");
?>
</center><br>
<center><img src="horse2.gif" alt="Dog" width="300" height="300"></center>
</body>
</html>