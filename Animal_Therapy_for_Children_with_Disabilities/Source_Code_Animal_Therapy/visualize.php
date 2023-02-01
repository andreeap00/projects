<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>

<title >Children List</title>
<style>

body {
 font-family: 'Brush Script MT', cursive; 
  font-size: 30px;
  font-color: black;
  background-color: white;
}

table {
width: 100%;
color: ##f9e6ff;
font-size: 25px;
text-align: center;
}
th {
background-color: ##f9e6ff;
color: #0000ff;
}
tr:nth-child(even){background-color: #f2ccff}
</style>
</head>
<body>
<br>
<table>
<tr>
<th>Child ID</th>
<th>Child Name</th>
<th>Child Surname</th>
<th>Child Age</th>
<th>Disability</th>
<th>Therapy Animal</th>

<?php
$server_nm = "DESKTOP-MRD81O3\SQLEXPRESS01";
$connection = array( "Database"=>"therapy", "UID"=>"andreea2", "PWD"=>"andreea2");
$conn = sqlsrv_connect( $server_nm, $connection);
$q4 = "Select * from Children";
$params = array();
$options = array( "Scrollable" => SQLSRV_CURSOR_KEYSET );
$stmt = sqlsrv_query($conn, $q4, $params, $options );
$query4=sqlsrv_query($conn, $q4) or die ("Visualization Error");
$row_count = sqlsrv_num_rows($stmt);

while($row_count > 0)
{
	while($row = sqlsrv_fetch_array($stmt)){
		echo"<tr><td>".$row['Child_Id'] ."</td><td>". $row['Name'] ."</td><td>". $row['Surname'] ."</td><td>". $row['Age'] ."</td><td>".$row['Disability'] ."</td><td>". $row['Animal'] ."</td></tr>";
	}
$row_count--;
}echo "";
?>
</table>
<center><img src="dog.gif" alt="Dog" width="400" height="400"></center>
</body>
</html>