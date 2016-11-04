<%@page import="buildings.DomainFacade"%>
<%@page import="LogikLag.Building"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
skrevet af jonas
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    
    <%
    int buildingID = Integer.parseInt( request.getParameter( "buildingid" ) );
    Building b = DomainFacade.getBuilding( buildingID );
    %>
        <form action="updateBuilding" method="POST">
            <table>
                <tr><td>adresse</td><td><input type="text" name="street" value="<%=b.setStreet()%>"></td></tr>
                <tr><td>M2</td><td><input type="text" name="m2" value="<%=b.setM2()%>"></td></tr>
                <tr><td>Floor</td><td><input type="text" name="floors" value="<%=b.setFloors()%>"></td></tr>
                <tr><td>zip</td><td><input type="text" name="zipID" value="<%=b.setzipID()%>"></td></tr>
                
            </table>
            <input type="hidden" name="id" value="<%=buildingID%>">
            <input type="submit" name="action" value="Submit">
            <input type="submit" name="action" value="Cancel">
        </form>
        <form action="upload.php" method="post" enctype="multipart/form-data">
    Select image to upload:
    <input type="file" name="fileToUpload" id="fileToUpload">
    <input type="submit" value="Upload Image" name="submit">
</form>
        <input type="submit" value="Submit All" /> <div>TODO write content</div>
    
</html>