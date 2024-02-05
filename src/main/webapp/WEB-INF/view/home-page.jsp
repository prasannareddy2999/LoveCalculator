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
<h1 align="center">Love Calculator</h1>
<form:form action="process-homepage" method="get" modelAttribute="userInfo">
<div align="center">
<p>
<label for="yn">Your Name:</label>
<form:input  id="yn" path="userName"/>
<form:errors path="userName" cssClass="error"/>
</p>
<p>
<label for="cn">Crush Name:</label>
<form:input  id="cn" path="crushName"/>
<form:errors path="userName" cssClass="error"/>
</p>

<p>
<form:checkbox  id="check" path="termAndCondition"/>
<form:errors path="termAndCondition" cssClass="error"/>
<label>I agree with all the senses that this is for fun</label>
</p>


<input type="submit" value="calculate"/>
</div>
</form:form >
</body>

</html>