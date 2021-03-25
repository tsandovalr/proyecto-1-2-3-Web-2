

var myButtonSubirVideo = document.getElementById('IdBotonSubirVideo');
var myFormSubirVideo = document.getElementById('FormSubirVideo');
var file = document.getElementById('file');





const sendSubirVideo = (e)=>{
        e.preventDefault();

if(file.files.length>=1){

        const formData = new FormData(myFormSubirVideo);


        fetch('/User', {
                    method: 'post',
                    body: formData
                }).then((Response)=>{    
                    return Response.text();
                }).then((text)=>{
                   
                    console.log(text);
                    alert("Subido exitosamente");
                    
                }).catch((error)=>{
                    console.error(error);
                })
            
            }

};

myButtonSubirVideo.onclick = sendSubirVideo;




