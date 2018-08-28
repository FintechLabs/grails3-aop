<nav class="navbar navbar-expand-lg navbar-light bg-light rounded">
    <a class="navbar-brand" href="${createLink(uri: "/")}">WebHooks</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample09"
            aria-controls="navbarsExample09" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExample09">
        <ul class="navbar-nav mr-auto pull-right">
            <sec:ifNotLoggedIn>
                <li class="nav-item">
                    <a class="nav-link" href="${createLink(controller: 'login', action: 'auth')}">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${createLink(controller: 'auth', action: 'register')}">Register</a>
                </li>
            </sec:ifNotLoggedIn>
            <sec:ifLoggedIn>
                <li class="nav-item">
                    <a class="nav-link" href="${createLink(controller: 'logout')}">Logout</a>
                </li>
            </sec:ifLoggedIn>
        </ul>

        <form class="form-inline my-2 my-md-0">
            <input class="form-control" type="text" placeholder="Search" aria-label="Search">
        </form>
    </div>
</nav>