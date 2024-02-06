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
<form:form action="process-homepage" method="get" modelAttribute="userRegistrationDTO">
<div align="center">
<p>
<label for="name">Name:</label>
<form:input  id="name" path="name"/>
<form:errors path="name" cssClass="error"/>
</p>

<p>
<label for="uName">User Name:</label>
<form:input  id="uName" path="userName"/>
<form:errors path="userName" cssClass="error"/>
</p>

<p>
<label for="pass">Password:</label>
<form:input  id="pass" path="Password"/>
<form:errors path="Password" cssClass="error"/>
</p>

<p>
<label for="cntry">Country</label>
<form:select path="country">
<form:option value="India" label="India"/>
<form:option value="USA" label="USA"/>
</form:select>
<form:errors path="country" cssClass="error"/>
</p>

<p>
<label for="Hobby">Hobby</label>
<form:checkbox path="hobby" value="cricket"/>
<label for="crck">Cricket</label>
<form:checkbox path="hobby" value="Reading"/>
<label for="read">Reading</label>
<form:checkbox path="hobby" value="Travel"/>
<label for="travel">Travel</label>
<form:checkbox path="hobby" value="programming"/>
<label for="prgm">Programming</label>
<form:errors path="hobby" cssClass="error"/>
</p>

<p>
<label for="Gender">Gender</label>
<form:radiobutton path="Gender" value="Male"/>
<label for="Male">Male</label>
<form:radiobutton path="Gender" value="Female"/>
<label for="Female">Female</label>
</p>

<input type="submit" value="calculate"/>
</div>
</form:form >
</body>

</html>