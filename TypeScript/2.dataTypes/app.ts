// 1st Way:

let myName : string = "mikel";
console.log(myName,typeof myName);

// 2nd way:

let age : number;
console.log(age,typeof age);

// 3rd way:

let mobileNumber = 8436984559;
console.log(mobileNumber,typeof mobileNumber);

//4th way(make the static typing to dyanmic typing)
let address;
console.log(address,typeof address);

// void retuen type

let calAge = function():void{
console.log("age is",21)
}
calAge();

class person{

    // two access specifier available,publc and private.while using private variable are automatically initialized
    constructor(public name : string, public age : number){

    }
}

let person1=new person("Mikel",24);
console.log(person1)


//inheritance
class students extends person{
    constructor(name : string,age : number,public rollNo : number){
        super(name, age);//super() is used to call the parent class construtor
    }
}

let students1=new students("John",25,122);

console.log(students1);
