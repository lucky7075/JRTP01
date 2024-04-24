<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>All Vehicles</h1>
  <p>Total number of vehicles: ${totalVehicles}</p>
	   <table>
            <thead>
                <tr>
                    <th>DriverID </th>
                    <th>VehicleName </th>
                    <th>SeatingCapacity </th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${vehiclestotal}" var="vehicle">
                    <tr>
                        <td>${vehicle.DriverID}</td>
                        <td>${vehicle.VehicleName}</td>
                        <td>${vehicle.SeatingCapacity}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</body>
</html>