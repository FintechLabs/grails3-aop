<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title><g:layoutTitle default="WebHooks"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
    <g:layoutHead/>
    <asset:stylesheet href="application.css"/>
</head>

<body>
<g:render template="/common/header"/>
<div class="container">
    <br/>
    <g:if test="${flash.message}">
        <div class="alert alert-info" role="alert">
            ${flash.message}
        </div>
    </g:if>
    <br/>
    <g:layoutBody/>
</div>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
<asset:javascript src="application.js"/>
</html>
