// class Student {
//   constructor(firstName, lastName, rollNo, mark) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.rollNo = rollNo;
//     this.mark = mark;
//     this.fullName = firstName + " " + lastName;

//     this.averageMarks = (function (m) {
//       let n = m.length;
//       let avg = 0;
//       for (let i = 0; i < n; i++) {
//         avg += m[i];
//       }
//       return avg / n;
//     })(mark);

//     this.grade = (function (m) {
//       let n = m.length;
//       let grade = Array(n);
//       for (let i = 0; i < n; i++) {
//         if (m[i] > 80 && m[i] <= 100) grade[i] = "A";
//         else if (m[i] > 60 && m[i] <= 80) grade[i] = "B";
//         else if (m[i] > 40 && m[i] <= 60) grade[i] = "c";
//         else grade[i] = "D";
//       }
//       return grade;
//     })(mark);
//   }
// }

// let s1 = new Student("Akash", "Yadav", 22, [92, 67, 66, 62, 56]);

// let s2 = new Student("Yash", "Shinde", 11, [76, 100, 56, 60]);

// console.log(s1);

// console.log(s2);

// // let temp=s1
// // s1=s2

// // console.log(s1)
// // s1.firstName="Nitesh"

// // console.log(s2)
// // console.log(typeof(temp))

class Student { 
    constructor(firstName, lastName, rollNo, marks) { 
        this.firstName = firstName 
        this.lastName = lastName 
        this.rollNo = rollNo 
        this.marks = marks 
        this.fullName = firstName + " " + lastName 
        this.avgmarks = Student.calculateAverage(marks); 
        this.grade = Student.calculateGrade(marks); 
        // this.finalGrade = this.calculateGrade([this.avgmarks])//[A] 
        // this.finalGrade = this.calculateGrade([this.avgmarks])[0]//A 
 
    } 
 
 
 
 
    static calculateAverage(marks) { 
        console.log(marks); 
        let sum = 0; 
        for (let i = 0; i < marks.length; i++) { 
            sum += marks[i]; 
        } 
        // let average = sum / marks.length; 
        return sum / marks.length; 
    } 
    static calculateGrade(marks) { 
        let grade = Array(marks.length); 
        for (let i = 0; i < marks.length; i++) { 
            if (marks[i] > 80 && marks[i] <= 100){ 
                grade[i] = "A"; 
            }  
        else if (marks[i] > 60 && marks[i] <= 80){ 
            grade[i] = "B"; 
        } 
        else if (marks[i] > 40 && marks[i] <= 60){ 
            grade[i] = "c"; 
        } 
        else{ 
            grade[i] = "D"; 
        }  
      } 
         
        return grade; 
    } 
} 
 
 
let s1 = new Student("Akash", "Yadav", 22, [92, 67, 66, 62, 56]);

let s2 = new Student("Yash", "Shinde", 11, [76, 100, 56, 60]);
 
 
 
// s1 = s2 
// console.log(s1) 
// console.log(s2)