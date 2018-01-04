<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<style>
			.error{color:red}
		</style>
	</head>
	<body>
		<form:form action="processFormStudent" modelAttribute="student">
			First Name <form:input path="firsName"/>
			<br><br>
			Last Name(*) <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/>
			<br><br>
			Country:
			<form:select path="country">
			<!--  
				<form:option value="BRA" label="Brasil"/>
				<form:option value="MEX" label="Mexico"/>	
				<form:option value="IND" label="India"/>	
				<form:option value="FRA" label="Francia"/>
			-->
			<form:options items="${student.countryOptions}"/>		
			</form:select>
			<br><br>
			Languaje:
			
			JAVA <form:radiobutton path="language" value="JAVA"/>
			C# <form:radiobutton path="language" value="C#"/>
			Python <form:radiobutton path="language" value="Python"/>
									
			<br><br>
			
			Operating system:
			Linux <form:checkbox path="operatingSystem" value="Linux"/>
			Mac OS <form:checkbox path="operatingSystem" value="MacOS"/>
			Windows <form:checkbox path="operatingSystem" value="Windows"/>
									
			<br><br>
			<input type="submit" value="submit"/>
		</form:form>
	</body>
</html>