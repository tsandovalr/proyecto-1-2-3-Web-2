

var div = document.getElementById('div');
var h2 = document.getElementById('h2');



fetch('http://localhost:8127/Registrouru/Login', {
    method: 'get',
          
}).then((Response)=>{    
    return Response.text();
}).then((text)=>{
    
    
    console.log(text+" ha iniciado sesion."); 

   
    
    h2.innerHTML = "Bienvenido a tu página, "+text+"."
            
    

 


    
}).catch((error)=>{
    console.error(error);
})
