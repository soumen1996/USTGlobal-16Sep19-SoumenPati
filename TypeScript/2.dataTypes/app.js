// 1st Way:
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "mikel";
console.log(myName, typeof myName);
// 2nd way:
var age;
console.log(age, typeof age);
// 3rd way:
var mobileNumber = 8436984559;
console.log(mobileNumber, typeof mobileNumber);
//4th way(make the static typing to dyanmic typing)
var address;
console.log(address, typeof address);
// void retuen type
var calAge = function () {
    console.log("age is", 21);
};
calAge();
var person = /** @class */ (function () {
    // two access specifier available,publc and private.while using private variable are automatically initialized
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person("Mikel", 24);
console.log(person1);
//inheritance
var students = /** @class */ (function (_super) {
    __extends(students, _super);
    function students(name, age, rollNo) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNo = rollNo;
        return _this;
    }
    return students;
}(person));
var students1 = new students("John", 25, 122);
console.log(students1);
