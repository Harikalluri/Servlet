<html>
<body>
<h2>Hello World!</h2>





<div align="center">


  <form action="login">
  
     username: <input type="text" name="username">
     password:<input type="password" name="password">
     
     <button>Login</button>
     
     
     
  </form>
</div>
</body>

<script >

   alert("<%=request.getAttribute("message") %>")
</script>

</html>
