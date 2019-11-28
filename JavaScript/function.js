//Name function 
function add(num1,num2)
{
    console.log('Sum',num1+num2);
}

add(15,17)//method calling


//Function Expression(Anonymous)

var sub=function(num1,num2)
{
    var subValue=num1-num2;
    return subValue;
}

var value=sub(25,30)
console.log('Value=',value);


greeting();
function greeting(msg)
{
    console.log("Hello");
}