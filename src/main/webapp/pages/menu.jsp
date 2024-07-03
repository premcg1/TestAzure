<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Menu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .menu-container {
            width: 100%;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f0f0f0;
        }

        .menu {
            list-style: none;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .menu-item {
            margin-bottom: 20px;
        }

        .menu-item a {
            text-decoration: none;
            color: #333;
            font-size: 20px;
            padding: 10px 20px;
            border-radius: 5px;
            background-color: #fff;
            transition: background-color 0.3s ease;
        }

        .menu-item a:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <div class="menu-container">
        <div class="menu">
            <div class="menu-item">
                <a href="/insert" >Insert</a>
            </div>
            <div class="menu-item">
                <a href="/delete">Delete</a>
            </div>
            <div class="menu-item">
                <a href="/update">Update</a>
            </div>
            <div class="menu-item">
                <a href="/search">Search</a>
            </div>
            <div class="menu-item">
                <a href="/all">Get All Records</a>
            </div>
        </div>
    </div>
</body>
</html>
