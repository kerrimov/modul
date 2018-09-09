<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Database</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
</head>
<body>
<form class="form-group"
      method="post"
      action="/createtable">
    <label>Create a table </label>
    <div>
        <input type="text" id="nametable1" name="nametablecreate" placeholder="Enter a name table">
        <input type="text" id="col" name="col" placeholder="Enter a number col">
        <input type="submit" value="Create table" class="btn btn-primary" id="create-table">
    </div>
</form>
<form class="form-group"
      method="post"
      action="/droptable">
    <label>Delete a table by number</label>
    <div>
        <input type="text" id="nametable4" name="nametabledrop" placeholder="Enter a name table">
        <input type="submit" value="Delete table" class="btn btn-primary" id="drop-table">
    </div>
</form>
<form class="form-group"
      method="post"
      action="/deleterow">
    <div>
        <label>Delete row </label>
        <div>
            <input type="text" id="nametable5" name="nametable5" placeholder="Enter a name table">
            <input type="text" placeholder="Enter a number row" name="row3">
            <input type="submit" value="Delete row" class="btn btn-primary" id="delete-row">
        </div>
    </div>
</form>
<form class="form-group"
      method="post"
      action="/getdata">
    <div>
        <label>Add data to the table by number row</label>
        <div>
            <input type="text" id="nametable2" name="nametabledata1" placeholder="Enter a name table">
            <input type="text" placeholder="Enter a number row" name="row2">
            <input type="text" placeholder="Enter a data" name="data1">
            <input type="submit" value="Insert data" class="btn btn-primary" id="insert-data">
        </div>
    </div>
</form>
<form class="form-group"
      method="post"
      action="/json">
    <div>
        <input type="text" placeholder="Enter a nametable" name="tablename7">
        <input type="submit" value="JSON" class="btn btn-primary" id="json">
    </div>
</form>
<script src="js/test.js"></script>
</body>
</html>