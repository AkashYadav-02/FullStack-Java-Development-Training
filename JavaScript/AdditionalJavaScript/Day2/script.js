
const button=document.querySelector('button');
console.log(button);
const ulRef=document.querySelector('ul');
console.log(ulRef);
const player=document.querySelector('input');
console.log(player);

const output=document.querySelector('p')
liAllRef=document.querySelectorAll('li');
// button.addEventListener('click',e=>{
//   ulRef.innerHTML+=`<li>${ player.value}</li>`;
// })

 

button.addEventListener('click',e=>{
    console.log(player.value);
    if(player.value!=''){
    var li= document.createElement('li');
    li.textContent = player.value;
    ulRef.appendChild(li);
    player.value = ''; 
    }
    // //for dynamic lists
    // li.addEventListener('click',e=> {
    //     console.log(e.target.remove()); 
    //   });
      output.textContent=" ";


})



player.addEventListener('input',e=>{

    output.textContent=player.value;
   
})



// console.log(liAllRef);

// liAllRef.forEach(li => {
//     li.addEventListener('click',e=> {
//       console.log(e.target.remove()); 
//     });
//   });

ulRef.addEventListener('click',(e)=> {
     if(e.target.tagName!='UL'){
      console.log(e.target.remove()); 
     }
    });
