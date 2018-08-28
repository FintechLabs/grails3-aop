<html>
<head>
    <meta name="layout" content="main">
</head>

<body>
<div class="card">
    <div class="card-body">
        <h5 class="card-title">Person List</h5>
        <g:if test="${personList}">
            <table class="table table-condensed table-responsive table-striped">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Full Name</th>
                    <th scope="col">Email Address</th>
                    <th scope="col">Status</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <g:each in="${personList}" var="person" status="i">
                    <tr>
                        <th scope="row">${i + 1}</th>
                        <td>${person?.fullName}</td>
                        <td>${person?.username}</td>
                        <td>${person?.personType?.name()}</td>
                        <td>
                            <a href="${createLink(controller: 'admin', action: 'enablePersonAccount', id: person?.uniqueId)}"
                               class="badge badge-primary">Activate</a>
                        </td>
                    </tr>
                </g:each>
                </tbody>
            </table>
        </g:if>
        <g:else>
            <div class="alert alert-danger" role="alert">
                Not found!
            </div>
        </g:else>
    </div>
</div>
</body>
</html>