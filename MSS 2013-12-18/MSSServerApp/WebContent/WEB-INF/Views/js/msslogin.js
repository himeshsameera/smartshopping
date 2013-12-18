

if(localStorage.getItem('logged')=="true"){

		console.log("Logged in");
		document.getElementById("header").innerHTML =  document.getElementById("header").innerHTML + '<button data-role="button" class="ui-btn-right" onclick="logout()" >Logout</button>'; 
		document.getElementById("topics").innerHTML =  document.getElementById("topics").innerHTML + '<a href="item.html" data-role="button" data-icon="edit"  >My Items</a> <br/>';
}else{
		console.log("Not logged in");
		document.getElementById("header").innerHTML =  document.getElementById("header").innerHTML + '<a href="login.html" data-role="button" class="ui-btn-right" >Login</a>';
}

function logout(){
    	console.log("Logged out");
		localStorage.setItem('logged', "false");
                location.reload(); 
} 

