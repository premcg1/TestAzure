<%@ page language="java" import="java.util.List, com.cg.rest.entity.Hotel" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Hotel Records</title>
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

        /* Adjusted table headers for Hotel Records */
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
    <table border="1">
        <tr>
            <th>Hotel ID</th>
            <th>Hotel Name</th>
            <th>Hotel Address</th>
        </tr>
        <% 
            List<Hotel> records = (List<Hotel>) request.getAttribute("records");
            if (records != null) {
                for (Hotel record : records) {
        %>
            <tr>
                <td><%= record.getHotelId() %></td>
                <td><%= record.getHotelName() %></td>
                <td><%= record.getHotelAddress() %></td>
            </tr>
        <% 
                }
            }
        %>
    </table>
</body>
</html>
