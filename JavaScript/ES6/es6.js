// const message=new Promise(function(resolve,reject){
//     if(30>20){
//         resolve('Success')
//     }
//     else{
//         reject('Failed')
//     }
// })

// message.then(function(msg){
// console.log('Success Message',msg)
// }).catch(function(error){
//     console.log('Failure Message',error)
// })


// const employee = new Promise(function(resolve,reject){
//     if(30>20){
//         resolve([{
//             name : 'Bill Gates',
//             age : 67 
//         },{
//             name : 'Mark Zuckerberg',
//             age : 45
//         }])
//     }else{
//         reject('Failed')
    
//     }
// })

// employee.then(function(data){
//     console.log('Employee Data ',data)
// }).catch(function(error){
//     console.log('Failure Message',error)
// })


//closure
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10;
        return counter
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value',counter)
