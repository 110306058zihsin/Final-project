<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoogleSearch</title>
<style type="text/css">
body {
	background-image: url('images/back.png');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

#padding {
	padding: 0px 0px 15px 15px;
}

a {
	color: #FFFFFF;
	/*font-size: 30px;*/
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}

.border-style {
	border-radius: 90px/90px;
}
.
</style>
</head>
<body>
<body>
	<form action='${requestUri}' method='get'>

		<div
			style='font-size: 30px;position: absolute; margin-top: 190px; margin-left: 50px; width: 100%; height: 100%'>
			<%
			String[][] orderList = (String[][]) request.getAttribute("query");
			for (int i = 0; i < orderList.length; i++) {
				String s = orderList[i][1];
			%>

			<a href='<%=s%>'><%=orderList[i][0]%> </a> <br> <br> <br>
			<%
			}
			%>
		</div>
		<div>
			<img src="images/logo.png"
				style='position: absolute; width: 150px; height: 100px; left: 50%; top: 50%; margin-top: -310px; margin-left: -590px'>
		</div>
		<div>
			<input type='text' class="border-style" id="padding" name='keyword'
				style='font-size: 120%; position: absolute; left: 50%; top: 48%; margin-top: -250px; margin-left: -400px; width: 800px; height: 25px'
				placeholder='請輸入關鍵字' value='<%=request.getParameter("keyword")%>' />
		</div>
		<div
			style=' position: absolute;margin-top: 190px;right: 0px;  '>
			<%
			String[][] relate = (String[][]) request.getAttribute("relate");
			for (int i = 0; i < relate.length; i++) {
				String r = relate[i][1];
			%>
			<a href='<%=r%>'><%=relate[i][0]%> </a> <br> <br> <br>
			<%
			}
			%>
		</div>

	</form>
</body>
</html>