
class Student{

    constructor(firstName, lastName,fullName, rollNo, marks,avgmarks,grade,finalGrade) { 
        this.firstName = firstName 
        this.lastName = lastName 
        this.rollNo = rollNo 
        this.marks = marks 
        this.fullName =  fullName 
        this.avgmarks = avgmarks 
        this.grade = grade
        this.finalGrade=finalGrade
     
 
    }


    static newStudent(firstName,lastName,rollNo,marks)
    {
        if(typeof(firstName)!="string")
        {
            return " Invalid  firstName "
        }
        if(typeof(lastName)!="string")
        {
            return " Invalid  lastName "
        }
        if(typeof( rollNo)!="number")
        {
            return " Invalid  rollNo "
        }
        if( typeof(marks)!=="object"){
            return " Invalid marks "
        }
        
        if(!marks.every((element) => typeof element === "number")){
            return " Invalid  subjects marks"
        }
    

        let fullName=firstName+" "+lastName
        let  grade=Student.calculateGrade(marks)
        let average=Student.calculateAverage(marks)
         let finalGrade = grade[0]
      return  new Student(firstName,lastName,fullName,rollNo,marks,average,grade ,finalGrade)

    }

    static calculateAverage(marks) { 
       
        let  sum = 0; 
        for (let i = 0; i < marks.length; i++) { 
            sum += marks[i]; 
        } 
      
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


let s1=Student.newStudent("Akash","Yadav", 22, [92, 66, 62, 56])

// console.log(s1)

// console.log(s1.constructor.name)

console.log(new Date('1a-22-2002'))