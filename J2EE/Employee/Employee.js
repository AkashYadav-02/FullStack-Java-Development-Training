const Personal = require("./Personal");
const Office = require("./Office");
class Employee {
  #age
  constructor(
    firstName,
    lastName,
    fullName,
    monthlSalary,
    annualSalary,
    dateOfJoining,
    employeeId,
    designation,
    contactNumber,
    personal,
    office,

    age,
    dateOfBirth
  ) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = fullName;
    this.monthlSalary = monthlSalary;
    this.annualSalary = annualSalary;
    this.dateOfJoining = dateOfJoining;
    this.designation = designation;

    this.reportingOfficer = undefined;

    this.#age = age;
    this.dateOfBirth = dateOfBirth;

    this.contactNumber = contactNumber;
    this.personalinfo = personal;
    this.workinfo = office;
     this.totalExperient=undefined
    this.subordinates = [];
    this.resign=undefined
    
  }

  static newEmployee(
    employeeId,
    firstName,
    lastName,
    monthlSalary,
    designation,
    contactNumber,
    dateOfJoining,
    personalEmail,
    companyEmail,
    dateOfBith,
    personalAdress,
    PersonalCity,
    personalCountry,
    companyAdress,
    companyCity,
    companyCountry
  ) {
    if (typeof firstName != "string") {
      return " Invalid  firstName ";
    }
    if (typeof lastName != "string") {
      return " Invalid  lastName ";
    }

    if (typeof designation != "string") {
      return " Invalid  designation ";
    }
    if (typeof personalEmail != "string") {
      return " Invalid  personalEmail ";
    }
    if (typeof PersonalCity != "string") {
      return " Invalid  PersonalCity ";
    }
    if (typeof personalCountry != "string") {
      return " Invalid  personalCountry ";
    }

    if (typeof companyEmail != "string") {
      return " Invalid  companyEmail ";
    }
    if (typeof companyAdress != "string") {
      return " Invalid  companyAdress ";
    }
    if (typeof companyCity != "string") {
      return " Invalid  companyCity ";
    }
    if (typeof companyCountry != "string") {
      return " Invalid  companyCountry ";
    }
    if (typeof monthlSalary != "number") {
      return " Invalid  monthlSalary ";
    }
    if (typeof contactNumber != "number") {
      return " Invalid  contactNumber ";
    }

    let fullName = firstName + " " + lastName;
    let annualSalary = monthlSalary * 12;

    console.log("datePfBith`:", dateOfBith);
    let age = Employee.calculateDate(dateOfBith);
    console.log("dateOfJoining:", dateOfJoining);
    let exp = Employee.calculateDate(dateOfJoining);
    console.log(age, exp);

    let personal = new Personal(
      personalAdress,
      PersonalCity,
      personalEmail,
      personalCountry
    );
    let office = new Office(
      companyAdress,
      companyCity,
      companyEmail,
      companyCountry
    );

    return new Employee(
      firstName,
      lastName,
      fullName,
      monthlSalary,
      annualSalary,
      dateOfJoining,
      employeeId,

      designation,
      contactNumber,
      personal,
      office,

      age,
      dateOfBith
    );
  }

  #calculateDate(date) {
    const today = new Date();
    const birthDate = new Date(date);
    console.log("today.getFullYear()", today.getFullYear());

    let age = today.getFullYear() - birthDate.getFullYear();

    const monthDiff = today.getMonth() - birthDate.getMonth();
    if (
      monthDiff < 0 ||
      (monthDiff === 0 && today.getDate() < birthDate.getDate())
    ) {
      age--;
    }

    return age;
  }

  addReportingOfficer(reportingOfficer) {
    if (!(reportingOfficer instanceof Employee)) {
      return "   reportingOfficer is not belong to same organizatoiion  ";
    } else {
      this.reportingOfficer = reportingOfficer.fullName;
      reportingOfficer.addSubordinate(this);
    }
  }
  addSubordinate(subordinate) {
    if (subordinate instanceof Employee) {
      this.subordinates.push(subordinate.fullName);
    } else {
      console.log("must be an employee");
    }
  }

  resign(){
    this.resign=new Date();
  
    this.totalExperient=currentExperience+ new Date().getFullYear();
  }


  getAge(){
    return this.#age
  }

  getMethod(date){
    return calculateDate(date)
  }
}

const e1 = Employee.newEmployee(
  101,
  "AKSAH",
  "Yadav",

  30000,
  "Traineer Engineer",
  9967630255,
  "2022-12-23",
  "akash yadav@gmail.com",
  "akashyadav@aurionpro",
  "2001-12-22",
  "kajuwadi",
  "thane",
  "india",
  "rabale",
  "navi mumbai",
  "india"
);
const e2 = Employee.newEmployee(
  102,
  "Yash",
  "Yadav",

  37000,
  "Sde1 ",
  9967630255,
  "2022-12-23",
  "yash yadav@gmail.com",
  "yash@aurionpro",
  "2001-12-22",
  "nitin",
  "thane",
  "india",
  "rabale",
  "navi mumbai",
  "india"
);

// e1.addReportingOfficer(e2);

 console.log(e1);
console.log(e1.getAge());
console.log(e1.getMethod("2021-23-3"))
// console.log(e2);
