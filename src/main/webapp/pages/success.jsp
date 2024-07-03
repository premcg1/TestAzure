<%@ page language="java" import="com.cg.rest.entity.Hotel" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Result</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #333;
        }

        .success-message {
            color: green;
        }

        .error-message {
            color: red;
        }
    </style>
</head>
<body>
    <h1>Inserting Result</h1>
    <% 
        Hotel isUpdated = (Hotel) request.getAttribute("result");
        if (isUpdated != null) { %>
            <p class="success-message">Hotel information added successfully!</p>
    <% } else { %>
            <p class="error-message">Failed to insert hotel information.</p>
    <% } %>
</body>
</html>
