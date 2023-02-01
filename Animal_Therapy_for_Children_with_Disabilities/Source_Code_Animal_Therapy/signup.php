<html>
<head>
<style>
body {
 font-family: 'Brush Script MT', cursive; 
  font-size: 30px;
  background-color: #f2ccff;
}
</style>
<title>Sign Up</title>
</head>
<body>
<br><br>
<center>
<?php
$uname=$_POST["u_name"];
$usurname=$_POST["u_surname"];
$upass=$_POST["u_pass"];

echo("Name: ".$uname."<br>");
echo("Surname: ".$usurname."<br>");
echo("Password: ".$upass."<br>");

$server_nm = "DESKTOP-MRD81O3\SQLEXPRESS01";
$connection = array( "Database"=>"therapy", "UID"=>"andreea2", "PWD"=>"andreea2");
$conn = sqlsrv_connect( $server_nm, $connection);
$q1="Insert into Users(User_Name, User_Surname, User_Password) values('$uname', '$usurname', '$upass')";
echo("Successfully Signed Up!");
$query1=sqlsrv_query($conn, $q1) or die ("Sign Up Error");
?>
</center>
<center><img src="dog7.gif" alt="Dog" width="300" height="300"></center>
</body>
</html>