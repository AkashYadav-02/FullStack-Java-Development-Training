
const arr=[{
    Name:"JioCinema",
     subscription:true
},
{name:"Netflix",
subscription:false   
},
{name:"Hotstar",
subscription:true
},
{name:"Prime",
subscription:false
}
]

const subscribe = arr.filter(val => {
    return val.subscription ; 
});
console.log(subscribe);
const Notsubscribe = arr.filter(val => {
    return  !val.subscription ; 
});

console.log(Notsubscribe);

const prices=[200,100,300,500,1000];
console.log(prices.sort());
 const discountdedprice= prices.map((price)=>{
    return  price-price*.2;})
    for (let i = 0; i < prices.length; i++) {
        console.log(`Original Price: ${prices[i]}, Discounted Price: ${discountdedprice[i]}`);
    }






    const product = [ 
        {id:'1',name:'nirma',price:900}, 
        {id:'2',name:'vimal',price:600}, 
        {id:'3',name:'goldflak',price:400}, 
        {id:'4',name:'bike',price:40}, 
        {id:'5',name:'car',price:1500} 
     
    ];


     const latestPrice=product.map((prod)=>{
        if(prod.price>500)
         {
            return{
                "id":prod.id,
                "name":prod.name,

                 "price":prod.price-prod.price*0.2
         };
         }
         else 
         return prod;
     });


     console.log(latestPrice);
     const totalPrice = product.reduce((total, item) => {
         return total + item.price},0);

     console.log(totalPrice);

 var marks=[30,20,23,21,50,70,5,7,8];
//  console.log(marks.sort().reverse())  
console.log(marks.sort((v1,v2)=> v1-v2))
console.log(marks.find(mk => mk > 40));

console.log(product.sort((product1, product2) =>{
    return product1.price - product2.price;}))