var myForm = document.getElementById('form');
var myButton = document.getElementById('IdBoton');



const sendRegister = (e)=>{
 e.preventDefault();

const formData = new FormData(myForm);


fetch('http://localhost:8127/Registrouru/Registro', {
    method: 'post',
    body: formData        
}).then((Response)=>{
    return Response.text();
    
}).then((text)=>{
    console.log(text);
    alert("Registrado exitosamente");
}).catch((error)=>{
    console.error(error);
})

};

myButton.onclick = sendRegister;