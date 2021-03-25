var myButtonDelete = document.getElementById('IdBotonEstoySeguro');



const sendDelete = (e)=>{
 e.preventDefault();




fetch('http://localhost:8127/Registrouru/User', {
    method: 'delete',         
}).then((Response)=>{    
    return Response.text();
}).then((text)=>{
    
    console.log(text); 
   
    
    if(text == "success")
        location.href = 'https://calm-brook-52262.herokuapp.com/index.html';
    

  


    
}).catch((error)=>{
    console.error(error);
})

};

myButtonDelete.onclick = sendDelete;
