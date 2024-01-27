<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Love Calculator</title>
<script type="tet/javascript">
function validateUserName(){

}
</script>
</head>

<body>
<h1 align="center">Love Calculator</h1>
<form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validateUserName()">
<div align="center">
<p>
<label for="yn">Your Name:</label>
<form:input  id="yn" path="userName"/>
</p>

<p>
<label for="cn">Crush Name:</label>
<form:input  id="cn" path="crushName"/>
</p>

<input type="submit" value="calculate"/>
</div>
</form:form >
</body>

</html>