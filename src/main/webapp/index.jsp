<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" >

    <link rel="stylesheet" type="text/css" href="UserLogin.css">
</head>
<body>
    <div class="container px-4 py-5 mx-auto">
        <div class="card card0">
            <div class="d-flex flex-lg-row flex-column-reverse">
                <div class="card card1">
                    <div class="row justify-content-center my-auto">
                        <div class="col-md-8 col-10 my-5">

                            <h3 class="mb-5 text-center heading">We are Tidi</h3>
                            <h6 class="msg-info">Please login to your account</h6>
                            <form action="userLogin" action="get">
                            <div class="form-group"> <label class="form-control-label text-muted">Username</label> <input type="text" id="email" name="username" placeholder="Phone no or email id" class="form-control"> </div>
                            <div class="form-group"> <label class="form-control-label text-muted">Password</label> <input type="password" id="psw" name="password" placeholder="Password" class="form-control"> </div>
                            <div class="row justify-content-center my-3 px-3"> <button type="submit" class="btn-block btn-color">Login to Tidi</button> </div>
                            </form>
                            <div class="row justify-content-center my-2"> <a href="#"><small class="text-muted">Forgot Password?</small></a> </div>
                        </div>
                    </div>
                    <div class="bottom text-center mb-5">
                        <p href="#" class="sm-text mx-auto mb-3">Don't have an account?<button class="btn btn-white ml-2">Create new</button></p>
                    </div>
                </div>
                <div class="card card2">
                    <div class="my-auto mx-md-5 px-md-5 right">
                        <h3 class="text-white">We are more than just a company</h3> <small class="text-white">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</small>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script type="text/javascript">
        var Msg ='<%=session.getAttribute("getAlert")%>';
        if (Msg != "false") {
            alert("Invalid User or password");
        }
    </script>


</body>
</html>