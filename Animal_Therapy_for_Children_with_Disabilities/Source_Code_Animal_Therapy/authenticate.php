<html>
<head>
<style>
body {
 font-family: 'Brush Script MT', cursive; 
  font-size: 30px;
  background-color: #f2ccff;
}
</style>
<title>Authentication</title>
</head>
<body>

<?php
$server_nm = "DESKTOP-MRD81O3\SQLEXPRESS01";
$connection = array( "Database"=>"therapy", "UID"=>"andreea2", "PWD"=>"andreea2");
$conn = sqlsrv_connect( $server_nm, $connection);

$uname=$_POST["u_name"];
$usurname=$_POST["u_surname"];
$upass=$_POST["u_pass"];


$q0="Insert INTO User(User_Name, User_Surname, User_Password) VALUES ('$uname', '$usurname', '$upass')";
$query0=sqlsrv_query($conn, $q0) or die ("Authentication Error");
?>
</body>
</html>