<html>

<head>
	<title>HorseLand_Authentication</title>
<link rel="stylesheet" type="text/css" href="mystyle.css" />
<style>
body {
  font-family: 'Brush Script MT', cursive;
  background-image: url('db001.jpeg');
  background-repeat: no-repeat;
}


.button {
  border: none;
  color: white;
  padding: 4px 52px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 26px;
  font-family: 'Brush Script MT', cursive;
  margin: 2px 2px;
  transition-duration: 0.5s;
  cursor: pointer;
}

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid DodgerBlue;
}

.button1:hover {
  background-color: DodgerBlue;
  color: white;
  border: 2px solid black;
}
}
</style>
</head>

<body>
<?php

if (isset($_POST['u_name']) && isset($_POST['u_surname'])){
$server_nm = "DESKTOP-MRD81O3\SQLEXPRESS01";
$connection = array( "Database"=>"therapy", "UID"=>"andreea2", "PWD"=>"andreea2");
$conn = sqlsrv_connect( $server_nm, $connection);

$uname1=$_POST['u_name'];
$usurname1=$_POST['u_surname'];
$upass1=$_POST['u_pass'];
$q="Select * from Users where user_name='$uname1' and user_surname='$usurname1' and user_password='$upass1'";
//echo $q;
$params = array();
$options = array( "Scrollable" => SQLSRV_CURSOR_KEYSET );
$stmt = sqlsrv_query($conn, $q, $params, $options );
//$Result=sqlsrv_query($conn, $q) or die ("Query error");
$n=0;
$n=sqlsrv_num_rows($stmt);
//echo "n = ".$n;
if($n>0) {
echo "<p>&nbsp </p><p><font color='green'>Login correct</font></p>";
session_start();
$_SESSION['u_name']=$uname1;
$_SESSION['u_surname']=$usurname1;

$crt_path = "Location: main.php";
header($crt_path);
}
else 
{//echo "<p>&nbsp </p><p><font color='red'>Login incorrect</font></p>";

$crt_path = "Location: error.html";
header($crt_path);
}
}


?>
<p>&nbsp </p>

<form action="index.php" method="post">
<center>
<h1 style="font-size:3vw; border:2px solid DodgerBlue;">HorseLand</h1></style>
</center>
<center>
<h1 style="font-size:2.5vw;">Authenticate</h1></style>
<h1>
Name: <input type="text" name="u_name"></input><br>
Surname: <input type="text" name="u_surname"></input><br>
Password: <input type="password" name="u_pass"></input><br>
</h1>
<br>

<button class="button button1"; onclick="document.location='main.php'">Log In</button>
<br>
<h2><a href="form5.html" target="middle_frame">Sign Up</a></h2>

</center>
</form>
</body>
</html>