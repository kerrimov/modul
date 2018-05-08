<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Database</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
</head>

<body>
<form>
    <div class="form-group">
        <label for="TableName">Name of Table</label>
        <input type="text" class="form-control" id="TableName" placeholder="CreateTable">
    </div>
    <a href="CreateTable" class="btn btn-primary" role="button" id="button" action = "/CreateTable">Create Table</a>

    <div class="form-group">
        <label for="Line">InsertData</label>
        <input type="text" class="form-control" id="Line" placeholder="">
    </div>
    <a href="InsertData" class="btn btn-primary" role="button" id="button" action = "/InsertData">InsertData</a>

    <div class="form-group">
        <label for="Line">DeleteData</label>
        <input type="text" class="form-control" id="deletedata" placeholder="">
    </div>
    <a href="DeleteData" class="btn btn-primary" role="button" id="button" action = "/DeleteData">DeleteData</a>

    <div class="form-group">
        <label for="Line">DeleteTable</label>
        <input type="text" class="form-control" id="deletetable" placeholder="">
    </div>
    <a href="DeleteTable" class="btn btn-primary" role="button" id="button" action = "/DeleteTable">DeleteTable</a>

</form>

<script src="js/test.js"></script>
</body>
</html>