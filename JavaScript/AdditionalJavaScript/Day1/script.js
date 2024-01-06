//   const myFunc=( callbackFunc)=>{

//     console.log("Hellon world");

//     let num=10;
//     callbackFunc(num);
//   }

//   myFunc(function(value){
//     console.log(value);
//   });

 const players=["akash","yash","nitesh","rohit"]

//   players.forEach((player,index)=>{
//     console.log(player,index);
//   });

const  ul = document.querySelector("ul");
console.log(ul);

let html=``;

players.forEach((player,index)=>{
         
     html+=`<li>${player}</li>`;
       });

ul.innerHTML=html;

const student = {
    id:101,
   firstName:"Akash",
   lastName:"Yadav",
   email:"alasj@gmail.com",

    // login:function(){
    //     console.log("students logged in");

    // }
    // ,
    // logout:function(){
    //     console.log("students logged out ");

    // },
    // printhobbies:function(){
    //     console.log(this.hobbies);
    // },
    // printAllDetails:function(){
    //     console.log(this);
    // }

  };
  //console.log(this);
  
//   //student.printAllDetails();
//   const table = document.getElementById("studentTable");
  
//     const row = document.createElement("tr"); 
//     row.innerHTML = `<td>${student.id}</td>
//     <td>${student.firstName}</td>
//     <td>${student.lastName}</td>,
//     <td>${student.email}</td>`; 
//     tableBody.appendChild(row); 

  
  
const people = [ 
    { name: "yash", age: 28, occupation: "Engineer" }, 
    { name: "Nitesh", age: 32, occupation: "Designer" }, 
    { name: "Akash ", age: 45, occupation: "Teacher" } 
]; 

 
const tableBody = document.getElementById("tableBody"); 

 
for (const person of people) { 
    const row = document.createElement("tr"); 
    row.innerHTML = `<td>${person.name}</td><td>${person.age}</td><td>${person.occupation}</td>`; 
    tableBody.appendChild(row); 
}