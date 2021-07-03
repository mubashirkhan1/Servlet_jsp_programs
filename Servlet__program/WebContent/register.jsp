<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col m6  offset-m3">
		
		 <div class="card"> 
		 
		<div class="card-content">
		<h3 style="margin-top:10px;" class ="center">Ragister here!!<h3>
		<div class="form center-align">
			<form action="rag1" method="get" id="myform">
				<input type="text" name="username" placeholder="enter user name">
					<input type="password" name="userpassword" placeholder="enter user password">
					<input type="email" name="useremail" placeholder="enter user email">
						<button type="submit"  class="btn" > submit</button>
					</form>
					<div class="loader center-align" style="margin-top:10px ;display:none;">
					
    <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-yellow">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>
		</div>
		<h5>please wait...</h5>
		<!--  <script
		  src="https://code.jquery.com/jquery-3.6.0.js"
		  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		  crossorigin="anonymous">
		   </script>
		   
		      <script>
		      $(document).ready(function(){
		    	  console.log("page is ready...........")
		    	  
		    	  $("#myform").on('submit',function(event)
		    	  {
		    		  event.preventDefault();
		    		   var f=(this).serialize();
		    		   console.log(f);
		    		   
		    		   $.ajax({
		    			   
		    			   url:"rag1",data: f,type:'get',succes: function (data ,textStatus,jqXHR)
		    			   {
		    				   console.log(data);
		    				   console.log(success)
		    			   },error: function(jqXHR,textStatus,errorThrown){
		    				   console.log(data);
		    				   console.log(error);
		    				   
		    			   }
		    		   })
		    	  })
		      })
		      
		    		  
		     </script>  -->  

</body>
</html>
<html>