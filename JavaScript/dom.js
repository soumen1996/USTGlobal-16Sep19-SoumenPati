// let h1Element=document.getElementById('Demo')
// console.log('Element= ',h1Element);
// console.log('Element Text=',h1Element.textContent);
// h1Element.textContent='Good Evening'

// let buttonElement=document.createElement('button')
// buttonElement.textContent='Click Me!!!'
// console.log('Button Element',buttonElement);

// document.body.appendChild(buttonElement);

// let ulElement=document.createElement('ul');
// let li1Element=document.createElement('li');
// let li2Element=document.createElement('li');
// let li3Element=document.createElement('li');

// li2Element.textContent='Java';
// li1Element.textContent='SQL';
// li3Element.textContent='JavaScript';

// ulElement.appendChild(li1Element);
// ulElement.appendChild(li2Element);
// ulElement.appendChild(li3Element);
// document.body.appendChild(ulElement);

// h1Element.style.color='red';
// h1Element.style.fontSize='100px';

function showMessage(){
    alert("Hi Hello Welcome!!!");
}
function changeColor(){
    let pElement=document.getElementById('mover')
    pElement.style.color='green'
}

function removeColor(){
    let pElement=document.getElementById('mover')
    pElement.style.color='black'
}

function printHello() {

    //console.log('Hello');
    let userName= document.getElementById('username').value
    document.getElementById('showusername').textContent=userName;

     
}

let name= 'Rakesh'
let age= 21
let phoneNo= 7499881144
console.log('Name is '+name +'Age is '+ age+'phone no is '+ phoneNo)
console.log(`Name is ${name} age is ${age} phone no is ${phoneNo}`)
console.log(`2 + 2=${2+2}`)

//documents.getElementByID('b1').disabled=false