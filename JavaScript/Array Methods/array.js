// const hobbies=['Sleeping','Cricket','Eating','Coding','Roaming']
// console.log(typeof hobbies);

// const isArrayOrNot=Array.isArray(hobbies);
// console.log("Hobbies array or not",isArrayOrNot);

// console.log(hobbies.includes("Cricket"));

// console.log(hobbies.includes("Eating",1));

// hobbies.push("Guiter","VolleyBall");
// console.log("After Pushing",hobbies);

// hobbies.pop();
// console.log("After Poping:",hobbies);

// hobbies.unshift('Numismatics');
// console.log("After Unsifting:",hobbies);

// hobbies.shift();
// console.log("After shifting:",hobbies);

// var hobbies1=['Sleeping','Cricket','Eating','Coding','Roaming']
// hobbies1.splice(1,2,'Bird Watching','Pubg');
// console.log('After Splice:',hobbies1);

// console.log(hobbies1.slice(2,4));

// console.log(hobbies1.indexOf('Coding',2));

// console.log("================")


// console.log(hobbies1.join('-'));


const numbers=[145,298,336,414];
const numbers1=numbers.map(function(value,index)
{
    let newvalue=value+50;
    return newvalue;
})
console.log(numbers1);


console.log('============');


const numbers2=numbers.map(value=>value+50);
console.log(numbers2);
console.log('============');


const number3=numbers.filter(function(value,index)
{
    if(value>200)
    {
        return true;
    }
    else
    {
        return false;
    }
})

console.log('============');

const number4=numbers.filter(value=>value>200)
console.log(number4);

