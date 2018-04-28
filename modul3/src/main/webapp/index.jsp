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
        <label for="firstName">Name of database</label>
        <input type="text" class="form-control" id="firstName" placeholder="">
    </div>
    <div class="form-group">
        <label for="lastName">Line</label>
        <input type="text" class="form-control" id="lastName" placeholder="">
    </div>
    <div class="form-group">
        <label for="email">Column</label>
        <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="">

    </div>
    <div class="form-group">
        <label for="password">Enter your data</label>
        <input type="password" class="form-control" id="password" aria-describedby="passwordLength" placeholder="">
        <small id="passwordLength" class="form-text text-muted">Enter your data separated by commas</small>
    </div>
    <a href="MyExcel" class="btn btn-primary" role="button" id="button" >Create</a>

</form>

<script src="js/test.js"></script>
</body>
</html>