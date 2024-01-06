 getData= async()=>{
      const res=await fetch("books.json");
      if(res.status!=200){
         throw new error("Could not found File")
      }
      const data= res.json();
      return data;
 
    }

    console.log(getData);
 console.log(getData().then((data)=>{
    console.log(data);
 }).catch((err)=>{ console.log(err);}));