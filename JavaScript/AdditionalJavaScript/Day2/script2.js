
liAllRef=document.querySelectorAll('li');
// console.log(liAllRef);

liAllRef.forEach(li => {
    li.addEventListener('click',e=> {
      console.log(e.target.remove()); 
    });
  });