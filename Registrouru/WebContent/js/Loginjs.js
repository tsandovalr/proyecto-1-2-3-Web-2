var myFormLogin = document.getElementById('form');
var myButtonLogin = document.getElementById('IdBotonLogin');

var h2 = document.getElementById('h2');


const sendLogin = (e)=>{
 e.preventDefault();

const formData = new FormData(myFormLogin);


fetch('http://localhost:8127/Registrouru/Login', {
    method: 'post',
    body: formData        
}).then((Response)=>{    
    return Response.text();
}).then((text)=>{
    
    
    console.log(text); 

   
    
    if(text == "success") location.href = 'http://localhost:8127/Registrouru/home.html';
            
    

 


    
}).catch((error)=>{
    console.error(error);
})

};
myButtonLogin.onclick = sendLogin;


