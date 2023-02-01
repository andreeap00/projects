<html>
<head>
<style>
body {
 font-family: 'Brush Script MT', cursive; 
  font-size: 30px;
  background-color: #f2ccff;
}
</style>
<title>Insert Child</title>
</head>
<body>
<br><br>
<center>
<?php
$chname=$_POST["ch_name"];
$chsurname=$_POST["ch_surname"];
$chage=$_POST["ch_age"];
$chdisability=$_POST["ch_disability"];
$chanimaltype=$_POST["ch_animaltype"];

echo("The name of the child:".$chname."<br>");
echo("The surname of the child:".$chsurname."<br>");
echo("The age:".$chage."<br>");
echo("The disability:".$chdisability."<br>");
echo("The type of the companion:".$chanimaltype."<br>");

$server_nm = "DESKTOP-MRD81O3\SQLEXPRESS01";
$connection = array( "Database"=>"therapy", "UID"=>"andreea2", "PWD"=>"andreea2");
$conn = sqlsrv_connect( $server_nm, $connection);
$q1="Insert into Children(Name, Surname, Age, Disability, Animal) values('$chname', '$chsurname', '$chage', '$chdisability', '$chanimaltype')";
echo("Successfully inserted!");
$query1=sqlsrv_query($conn, $q1) or die ("Insertion Error");
?>
</center>
<center><img src="dog5.gif" alt="Dog" width="300" height="300"></center>
</body>
</html>