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
        <label for="DBName">Name of Table</label>
        <input type="text" class="form-control" id="TableName" placeholder="Enter table name">
    </div>
    <div class="form-group">
        <label for="Line">Line</label>
        <input type="text" class="form-control" id="Line" placeholder="">
    </div>
    <div class="form-group">
        <label for="Column">Column</label>
        <input type="email" class="form-control" id="Column" aria-describedby="ColumnHelp" placeholder="">

    </div>
    <div class="form-group">
        <label for="YourData">Enter your data</label>
        <input type="text" class="form-control" id="YourData" aria-describedby="DataLength" placeholder="Enter your data">
        <small id="DataLength" class="form-text text-muted">Enter your data separated by commas</small>
    </div>
    <a href="CreateTable" class="btn btn-primary" role="button" id="button" action = "/CreateTable">Create</a>

</form>

<script src="js/test.js"></script>
</body>
</html>