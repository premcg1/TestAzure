<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Result</title>
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
    <h1>Delete Result</h1>
    <% 
        String isDeleted = (String)request.getAttribute("isDeleted");
        if (isDeleted != null) { %>
            <p class="success-message">Hotel deleted successfully!</p>
    <% } else { %>
            <p class="error-message">Failed to delete hotel.</p>
    <% } %>
</body>
</html>
