<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Love Calculator</title>
<style type="text/css">
.error {
color:red;
position:fixed;
text-align:left;
margin-left:30px;

}
</style>
<script type="text/javascript">
function validateUserName(){
    var userName=document.getElementById('yn').value;
    if(userName.length<2)
    {
    alert("your name should have atleast 3 character");
    return false;
    }
    else
    {
    return true;}
}
</script>
</head>

<body>
<h1 align="center">Hi </h1>
<h2 align="center">Sent result to your email </h1>

<form:form action="process-email" method="get" modelAttribute="emailDTO">
<div align="center">
<p>
<label >Enter your email</label>
<form:input  id="email" path="userEmail"/>
<form:errors path="userEmail" cssClass="error"/>
</p>

<input type="submit" value="send"/>
</div>
</form:form >
</body>

</html>