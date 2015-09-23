<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang=''>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="resources/css/styles.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="script.js"></script>
   <title>CSS MenuMaker</title>
</head>
<body>
<P>  The time on the server is ${serverTime}. </P>
<p><a href="<c:url value="/j_spring_security_logout" />">Logout</a></p>
<div id='cssmenu'>
<ul>
   <li class='active'><a href='#'>Home</a></li>
   <li><a href='#'>Products</a></li>
   <li><a href='#'>Company</a></li>
   <li><a href='#'>Contact</a></li>
</ul>
</div>

</body>
<html>
