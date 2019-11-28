let person={
    name : 'Sundara',
    age : 100,
    color : 'white',
    address : {
        city : 'Bijapur',
        state : 'Karnataka',
        pincode : 591115 
    },

    hobbies : ['Coding','Bird Watching','Singing']
}

console.log('Java Script Object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object',jsonObject)

localStorage.setItem("email","billgates@gmail.com")
const emailId = localStorage.getItem('email')
console.log('Email ID',emailId)
localStorage.clear();