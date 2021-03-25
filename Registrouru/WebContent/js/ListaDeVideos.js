var divIN = document.getElementById('divIN');
var h2 = document.getElementById('h2');




fetch('/User', {
   
    method: 'get',
    
    headers: {                
        "Access-Control-Request-Method": "GET",
        "Access-Control-Request-Headers": "Content-Type"
    }

}).then((Response)=>{    
    return Response.text();
}).then((text)=>{

    extraer();
  
}).catch((error)=>{
    console.error(error);
})




function extraer(ele){

   
  
            var newElem = document.createElement("BR");
            var newElem2 = document.createElement("BR");

            var a = document.createElement('A');
            var valueA = document.createTextNode("695072014.mp4");
            a.setAttribute('href', 'http://localhost:8127/Registrouru/videos/695072014.mp4');
            a.appendChild(valueA);
            a.class = 'enlace';
            divIN.appendChild(a);

           

            var b = document.createElement('A');
            var valueA = document.createTextNode("Pexels.mp4");
            b.setAttribute('href', "http://localhost:8127/Registrouru/videos/Pexels.mp4");
            b.appendChild(valueA);
            b.class = 'enlace';
            divIN.appendChild(b);
            

            divIN.insertBefore(newElem, a);
            divIN.insertBefore(newElem2, b);


}//function




