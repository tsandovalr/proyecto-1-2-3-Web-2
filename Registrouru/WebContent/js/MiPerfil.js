



fetch('/Media', {
    method: 'get'

}).then((Response)=>{    
    return Response.text();
}).then((text)=>{
    
    
   
    if(text == "unchecked")sinfoto();
    else confoto(text);
    
 
   

    
}).catch((error)=>{
    console.error(error);
})




function confoto(arg){
    console.log(arg+" ha iniciado sesion."); 
    var form = document.getElementById("formCambiarFoto");
   
    
    var img = document.createElement("img");
    img.setAttribute("src", "http://localhost:8127/Registrouru/Fotos/"+arg);
    img.setAttribute("class", "img");    
    form.appendChild(img);

    var label = document.createElement("label");
    label.setAttribute("class", "nombre");
    label.innerHTML = arg;
    form.appendChild(label); 

    var inputfile = document.createElement('input');
    inputfile.setAttribute("type", "file");
    inputfile.setAttribute("id" , "idfile");
    inputfile.setAttribute("class", "file");
    inputfile.setAttribute("name" , "fileCambiarFoto");
    form.appendChild(inputfile);
    //form.getElementById("idfile").appendChild(inputfile); que tal asi?

    var boton = document.createElement("button");
    boton.className = "boton";
    boton.innerHTML = "Cambiar foto";   
    form.appendChild(boton); 

                    boton.onclick = ()=>{
                        if(inputfile.files.length>=1){

                                const formData = new FormData(form);

                                
                                fetch('/Media', {
                                method: 'post',
                                body: formData

                                }).then((Response)=>{    
                                
                                
                                return Response.text();

                                }).then((texto)=>{
                                
                                console.log(texto);
                                
                                }).catch((error)=>{
                                console.error(error);
                                })
                        }

                    };
                
}










function sinfoto(){
    console.log("No profile picture found.");
    var formmm = document.getElementById("formCambiarFoto");
   
    
    var img = document.createElement("img");
    img.setAttribute("src", "http://localhost:8127/Registrouru/Fotos/anonimo.jpg");
    img.setAttribute("class", "img");    
    formmm.appendChild(img);

    var label = document.createElement("label");
    label.setAttribute("class", "nombre");
    label.innerHTML = "No Picture";
    formmm.appendChild(label); 
    

    var boton = document.createElement("button");
    boton.className = "boton";
    boton.innerHTML = "Subir imagen";   
    formmm.appendChild(boton);

    var inputfile = document.createElement('input');
    inputfile.setAttribute("type", "file");
    inputfile.setAttribute("id" , "idfile");
    inputfile.setAttribute("name" , "fileCambiarFoto");
    inputfile.setAttribute("class" , "file");
    formmm.appendChild(inputfile);



    boton.onclick = ()=>{
        const formData = new FormData(formmm);
                        
                        if(inputfile.files.length>=1){
        
                        fetch('/Media', {
                        method: 'post',
                        body: formData

                    }).then((Response)=>{    
                        
                        
                        return Response.text();

                    }).then((texto)=>{
                        
                        console.log(texto);
                        
                    }).catch((error)=>{
                        console.error(error);
                    })
                }

                    };





    
}





