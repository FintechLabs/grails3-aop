<html>
<head>
    <meta name="layout" content="main">
</head>

<body>
<div class="card">
    <div class="card-body">
        <h5 class="card-title">Login</h5>

        <form action="/login/authenticate" method="post">
            <div class="form-group">
                <label for="username">Email address</label>
                <input type="email" class="form-control" id="username" name="username"
                       placeholder="Enter Email Address">
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="Password">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</body>
</html>