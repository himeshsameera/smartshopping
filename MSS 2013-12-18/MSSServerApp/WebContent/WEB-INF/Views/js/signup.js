

$(document).ready(function(){
    $("#signupError").hide();
    var details = {};
    var username;
    var password;
    var password_conf;
    var email;
    $("#signup").click(function(){
        username = $("#name").val();
        password = $("#password").val();
        password_conf = $("#password_conf").val();
        email = $("#email").val();
                       
        if (!password_conf.localeCompare("")){
            $("#signupError").html("Add password confirmation");            
            $("#signupError").show();
        }
        if (password_conf.localeCompare(password)){
            $("#signupError").html("The passwords do not match <br>Please try again");
            $("#signupError").show();
        }
        if(password.localeCompare("")){
            $("#signupError").html("Add a password");
            $("#signupError").show();
        }
        if(!emailValidate(email)){
            $("#signupError").html("Invalid email address <br>Please insert a valid email address");
            $("#signupError").show();
        }
        if (!email.localeCompare("")){
            $("#signupError").html("Add your email address");
            $("#signupError").show();
        }
        if(!nameValidate(username)){
            $("#signupError").html("Invalid username <br>Please insert a valid username");
            $("#signupError").show();
        }        
        if (!username.localeCompare("")){
            $("#signupError").html("Add a username");
            $("#signupError").show();
        }
               
    });
     
        
    emailValidate = function(email){ 
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
    };
    
    nameValidate = function(username){
        var regX = /^[a-zA-Z0-9_]+$/;;
        return regX.test(username);
    };
    
    
});