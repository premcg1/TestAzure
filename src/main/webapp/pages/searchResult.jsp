<%@ page language="java" import="com.cg.rest.entity.Hotel" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hotel Details</title>
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

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }

        /* Adjusted table headers for Hotel Details */
        th:nth-child(1), td:nth-child(1) {
            /* Hotel ID */
            width: 10%;
        }

        th:nth-child(2), td:nth-child(2) {
            /* Hotel Name */
            width: 30%;
        }

        th:nth-child(3), td:nth-child(3) {
            /* Hotel Address */
            width: 60%;
        }
    </style>
</head>
<body>
    <h1>Hotel Details</h1>
    <table border="1">
        <tr>
            <th>Hotel ID</th>
            <th>Hotel Name</th>
            <th>Hotel Address</th>
        </tr>
        <% 
            Hotel hotel = (Hotel) request.getAttribute("hotel");
            if (hotel != null) {
        %>
            <tr>
                <td><%= hotel.getHotelId() %></td>
                <td><%= hotel.getHotelName() %></td>
                <td><%= hotel.getHotelAddress() %></td>
            </tr>
        <% 
            } else {
        %>
            <tr>
                <td colspan="3" style="text-align: center;">No hotels found</td>
            </tr>
        <% 
            }
        %>
    </table>
</body>
</html>
