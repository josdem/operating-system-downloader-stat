<!DOCTYPE html>
<html>

<head>
  <meta name="layout" content="main"/>
  <title>Welcome to Grails</title>
</head>

<body>
  <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
  <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link><br/>
  </g:each>
</body>
</html>
