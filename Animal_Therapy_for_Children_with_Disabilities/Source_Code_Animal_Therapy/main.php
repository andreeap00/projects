<HTML>
<HEAD>
<TITLE>HorseLand</TITLE>
</HEAD>
<?php
session_start();
if(isset($_SESSION['u_name']) && isset($_SESSION['u_surname'])){ ?>
<FRAMESET  COLS="25%, 50%, 25%">
     <FRAME NAME="left_frame"   SRC="framea.html">
     <FRAME NAME="middle_frame" SRC="frameb.html">
     <FRAME NAME="right_frame"  SRC="framec.html">
</FRAMESET>
<?php }
else echo("<p><font color='red'>Unauthorized user</font></p>");?>
</HTML>
