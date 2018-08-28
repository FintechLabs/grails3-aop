<html>
<head>
    <meta name="layout" content="main">
</head>

<body>
<div class="card">
    <div class="card-body">
        <h5 class="card-title">Register to Get Started!</h5>

        <form action="${createLink(controller: 'auth', action: 'processRegister')}" method="post">
            <div class="form-group ${hasErrors(bean: person, field: "firstName", 'has-error')}">
                <label for="firstName">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter First Name">
            </div>

            <div class="form-group ${hasErrors(bean: person, field: "lastName", 'has-error')}">
                <label for="lastName">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter Last Name">
            </div>

            <div class="form-group ${hasErrors(bean: person, field: "username", 'has-error')}">
                <label for="username">Email address</label>
                <input type="email" class="form-control" id="username" name="username"
                       placeholder="Enter Email Address">
            </div>

            <div class="form-group" ${hasErrors(bean: person, field: "password", 'has-error')}>
                <label for="password">Password</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="Password">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</body>
</html>