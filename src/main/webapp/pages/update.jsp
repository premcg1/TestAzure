<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Hotel Information</title>
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

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        input[type="submit"] {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Update Hotel Information</h1>
    <form action="/updateHotel" method="POST">
        <label for="hotelId">Hotel ID:</label>
        <input type="number" id="hotelId" name="hotelId" required><br>
        
        <label for="hotelName">Hotel Name:</label>
        <input type="text" id="hotelName" name="hotelName" required><br>
        
        <label for="hotelAddress">Hotel Address:</label>
        <input type="text" id="hotelAddress" name="hotelAddress" required><br>
        
        <input type="submit" value="Update">
    </form>
</body>
</html>
