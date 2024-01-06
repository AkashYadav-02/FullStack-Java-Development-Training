  const getData=(url)=>{ 

    return new Promise((resolve,reject)=>{
        const request = new XMLHttpRequest(); 
         
        request.addEventListener('readystatechange',e=>{ 
            // console.log(request,request.readyState); 
            if (request.readyState==4 && request.status==200){ 
                // console.log(request.responseText); 
                  resolve(JSON.parse(request.responseText)); 
            } 
            else if (request.readyState==4){ 
                // console.log("could not fetch data"); 
                reject("could not fetch data"); 
            } 
        }); 
         
        request.open('GET',url); 
        request.send(); 
     } );
        }; 
        url ="https://jsonplaceholder.typicode.com/todos" 
         const url1= 'books.json'

 //console.log(getData());
 getData(url1).then((data)=>{
    console.log(data);
    return getData(url1);
 }).then((data)=>{
    console.log(data);
    return getData(url1);
 }).then((data)=>{
    console.log(data);
 
 }).catch((err)=>{
    console.log(err);
 })