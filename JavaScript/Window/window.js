console.log('Window Object',window);
console.log('This Keyword',this);
console.log(this===window);
// window.alert('Welcome to javaScript Class');
// alert('Welcome UST Global');

// confirm('Are You Sure You Want To Delete');

// let userName=prompt('What is Your Name','Soumen');
// console.log('User Name',userName);
const person={
    firstName:'Alia',
    lastName:'Kapoor',
    age:26,
    getName:function(){
    //console.log('This Keyword',this);
    return this.firstName+" "+this.lastName;

}
}

console.log('Full Name:',person.getName());
