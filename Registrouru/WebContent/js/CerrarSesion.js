


fetch('http://localhost:8127/Registrouru/Login', {
    method: 'put',         
}).then((Response)=>{    
    return Response.text();
}).then((text)=>{
    
    console.log(text); 
   
    
    
        location.href = 'http://localhost:8127/Registrouru/index.html';
    

    
}).catch((error)=>{
    console.error(error);
})


