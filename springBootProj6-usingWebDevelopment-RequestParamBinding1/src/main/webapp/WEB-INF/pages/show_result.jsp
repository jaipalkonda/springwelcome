<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;text-align:center">Result Page</h1>
<!-- 
<b>Request params value : ${param.sno} , ${param.sname}</b>
 

 <b> Request Collection Params :: ${param.sno}, ${param.sname},
                 ${paramValues['sadd'][0]}, ${paramValues['sadd'][1]}, ${paramValues['sadd'][2]}</b>
                 -->
                 
 <b> Request Collection Params :: ${param.sno}, ${param.sname},
                 ${paramValues.sadd[0]}, ${paramValues.sadd[1]}, ${paramValues.sadd[2]}, ${paramValues.sadd[3]}</b>
                                 
    
</body>
</html>