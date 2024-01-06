


// // // // // // // var c =10
// // // // // // // console.log("c",c)

// // // // // // // var d=14
// // // // // // // console.log("d",d)

// // // // // // // let e=33
// // // // // // // console.log("e",e)

// // // // // // // let f=300
// // // // // // // console.log("f",f)


// // // // // // // // const a=5
// // // // // // // console.log("a",a)
// // // // // // // const b=6

// // // // // // // console.log("b",b)

// // // // // // // b=13

// // // // // // // console.log("b",b)

// // // // // // // 


// // // // // // // let a
// // // // // // // console.log(a,typeof(a))
// // // // // // // let b=12

// // // // // // // console.log(b,typeof(b))

// // // // // // // let c=null
// // // // // // // console.log(c,typeof(c))
// // // // // // // // console.log(d+ +"200")
// // // // // // // let d="akash"
// // // // // // // console.log(d,typeof(d))
// // // // // // //a=[10,4,6,12]

// // // // // // // b=[10,4,6,12]
// // // // // // // console.log(a==b)
// // // // // // // a=b
// // // // // // // console.log(a==b)


// // // // // // function square(number) {
// // // // // //     return number * number;
// // // // // //   }

// // // // // // function add(number1,number2) {
// // // // // //   return number1 + number2;
// // // // // // }

// // // // // // function sub(number1,number2) {
// // // // // //     return number1 - number2;
// // // // // //   }



// // // // // // let randomFunction=(pram)=>{
// // // // // //     switch(pram){
// // // // // //         case "add" : return add
// // // // // //         case "sub": return sub
// // // // // //         default: return square

// // // // // //     }
// // // // // //   }


// // // // // //   let xyz=randomFunction("dsf")
// // // // // //   console.log(xyz(23))


// // // // // function sum(...numbers) {
// // // // //     // return numbers.reduce((acc, curr) => acc + curr, 0);
// // // // //     sum=0
// // // // //     for(acc:...numbers){
// // // // //         sum+=acc
// // // // //     }

// // // // // //     return sum
// // // // // //   }




//  function sum(...numbers) {
//     let total = 0;
//   for (let i = 0; i < numbers.length; i++) {
//     total += numbers[i];
//     }
//     return total;
//   }
// // // // //   console.log(sum(1,2,3,4,5,6,7,8))


// // // // //   console.log(sum(1,33,6,7,8))


// // // // // Creating Arrays
// // // // const array1 = [];
// // // const array2 = [1, 2, 3, 4, 5];

// // // // // Accessing Elements
// // // // console.log(array2[0]); // Output: 1

// // // // // Modifying Elements
// // // // array2[2] = 10;
// // // // console.log(array2); // Output: [1, 2, 10, 4, 5]

// // // // // Array Length
// // // console.log(array2.length); // Output: 5

// // // // // Adding Elements
// // //  array2.push(6);
// // //  console.log(array2); // Output: [1, 2, 10, 4, 5, 6]

// // //  array2.unshift(0);
// // //  console.log(array2); // Output: [0, 1, 2, 10, 4, 5, 6]

// // // array2.splice(3, 0, 8);
// // // console.log(array2); // Output: [0, 1, 2, 8, 10, 4, 5, 6]

// // // // // Removing Elements
// // // // array2.pop();
// // // // console.log(array2); // Output: [0, 1, 2, 8, 10, 4, 5]

// // // // array2.shift();
// // // console.log(array2); // Output: [1, 2, 8, 10, 4, 5]

// // // // array2.splice(2, 1);
// // // // console.log(array2); // Output: [1, 2, 10, 4, 5]

// // // // // Slicing and Concatenating
// // // // const slicedArray = array2.slice(1, 4);
// // // // console.log(slicedArray); // Output: [2, 10, 4]

// // // // const concatenatedArray = array1.concat(array2);
// // // // console.log(concatenatedArray); // Output: [1, 2, 10, 4, 5]

// // // // // Searching and Finding Elements
// // // // console.log(array2.indexOf(10)); // Output: 2
// // // // console.log(array2.lastIndexOf(4)); // Output: 3
// // // // console.log(array2.includes(8)); // Output: false

// // // // const foundElement = array2.find(element => element > 2);
// // // // console.log(foundElement); // Output: 10

// // // // const foundIndex = array2.findIndex(element => element > 2);
// // // // console.log(foundIndex); // Output: 2

// // // // // Filtering Elements
// // // // const filteredArray = array2.filter(element => element > 2);
// // // // console.log(filteredArray); // Output: [10, 4, 5]

// // // // // Mapping Elements
// // // // const mappedArray = array2.map(element => element * 2);
// // // // console.log(mappedArray); // Output: [2, 4, 20, 8, 10]

// // // // // Reducing Elements
// // // // // const sum = array2.reduce((acc, curr) => acc + curr, 0);
// // // // // console.log(sum); // Output: 22

// // // // // Iterating through Elements
// // // // array2.forEach(element => console.log(element));
// // // // // Output:
// // // // // 1
// // // // // 2
// // // // // 10
// // // // // 4
// // // // // 5

// //  const arr=['banana', 5, true , 'apple']
// // // const mixedArray = [10, 'banana', 5, true , 'apple', 25, 'orange', 'grape', 1,arr];
// //  arr[1]=10

// // console.log(arr)
// let board = [
//             [null, null, null],
//             [null, null, null],
//             [null, null, null]
//         ];

//         let currentPlayer = 'X';

//         function printBoard() {
//             console.log("Current Board:");
//             for (let row = 0; row < 3; row++) {
//                 console.log(board[row].join(' | '));
//                 if (row < 2) {
//                     console.log("---------");
//                 }
//             }
//         }

//         function checkWin() {
          
//             for (let i = 0; i < 3; i++) {
//                 if (board[i][0] === currentPlayer && board[i][1] === currentPlayer && board[i][2] === currentPlayer) {
//                     return true;
//                 }
//                 if (board[0][i] === currentPlayer && board[1][i] === currentPlayer && board[2][i] === currentPlayer) {
//                     return true;
//                 }
//             }

//             if (board[0][0] === currentPlayer && board[1][1] === currentPlayer && board[2][2] === currentPlayer) {
//                 return true;
//             }

//             if (board[0][2] === currentPlayer && board[1][1] === currentPlayer && board[2][0] === currentPlayer) {
//                 return true;
//             }

//             return false;
//         }

//         function checkTie() {
//             // Check if the board is full (tie)
//             for (let row = 0; row < 3; row++) {
//                 for (let col = 0; col < 3; col++) {
//                     if (board[row][col] === null) {
//                         return false;
//                     }
//                 }
//             }
//             return true;
//         }

//         function makeMove(row, col) {
//             if (board[row][col] === null) {
//                 board[row][col] = currentPlayer;
//                 if (checkWin()) {
//                     console.log(currentPlayer + " wins!");
//                     printBoard();
//                     return;
//                 }
//                 else if (checkTie()) {
//                     console.log("It's a tie!");
//                     printBoard();
//                     return;
//                 }
//                 currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
//             } else {
//                 console.log("Cell is already occupied!");
//             }
//         }

//         // Sample game
//         printBoard();
//         makeMove(0, 0); // X
//         makeMove(1, 1); // O
//         makeMove(0, 1); // X
//         makeMove(0, 2); // O
//         makeMove(1, 0); // X
//         makeMove(1, 2); // O
//         makeMove(2, 1); // X
//         makeMove(2, 0); // O
//         makeMove(2, 2); // X

arr[] ={1,2,4,5,6,7};