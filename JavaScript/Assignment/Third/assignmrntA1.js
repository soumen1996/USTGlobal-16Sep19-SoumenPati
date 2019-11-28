var person = ["John",50,"blue"];
for(var i=0;i<person.length;i++)
{
    console.log(person[i]);
}

var alcohol=["Old Monk",120,"Ram"];
for(var i=0;i<alcohol.length;i++)
{
    console.log(alcohol[i]);
}

var jeans=["Lee",32,600];
for(var i=jeans.length;i>=0;i--)
{
    console.log(jeans[i]);
}

var number=[24,86,98,17,35,16,15,3,4]
for(var i=0;i<number.length;i++)
{
    if(number[i]%2==0)
    {
        console.log(number[i])
    }
}


var number=[24,86,98,17,35,16,15,3,4]
for(var i=0;i<number.length;i++)
{
    if([i]%2==0)
    {
        console.log(number[i])
    }
}

var number=[24,86,98,17,35,16,15,3,4]
for(var i=0;i<number.length;i++)
{
    if(number[i]%2==0)
    {
        console.log(number[i]);
    }
}


var actor=['dhanush','ramcharan','pawan kalyan','nagarjuna','jr. ntr','allu arjun']
for(var i=0;i<actor.length;i++)
{
    
        console.log(actor[i]);

}

var actress=['samantha','shruti hasan','cathlyn teressa']
for(var i=0;i<actress.length;i++)
{
        console.log(actress[i])

}
    


var words=['a','b',,'d','e']
    for(var i=0;i<words.length;i++)
{

        console.log(words[i]);

}


var state=['Kerala','Karnataka','Rajsthan','West Bengal']
for(var i=0;i<state.length;i++)
{
    console.log(state[i]);
}

ar a=[10,40,50,20,60,30,90,80,50,30,71,20,50];
       for(var i=0;i<a.length;i++){
           console.log(a[i]);
       }
       console.log("Find Duplicate Number In array");
       var dummy=new Array();
       var dum=0;
       for(var i=0;i<a.length-1;i++){
           for(var j=i+1;j<a.length;j++){
               if(a[i]===a[j]){
                   dummy[dum++]=a[i];
                   for(var k=0;k<dummy.length;k++){
if(dummy[k]!==a[i]){
    console.log(a[i]);
}
                   }
                  
               }
           }
       }
       console.log("Find biggest number in array");
       var n=a[0];
       for(var i=0;i<a.length;i++){
if(n<a[i]){
    n=a[i];
}
       }
       console.log("Biggest number in array is ",n);
       console.log("Find second biggest number in array");
       var f=a[0],s=0;
       for(var i=0;i<a.length;i++){
if(f<a[i]){
f=a[i];
}
if(s<a[i] && f!=a[i]){
    s=a[i];
}
       }
       console.log("Second Biggest Number in array is "+s);
       console.log(" Find Smallest number in Array");
       var sm=a[0];
       for(var i=0;i<a.length;i++){
           if(sm>a[i]){
sm=a[i];
           }
       }
       console.log("Smallest number in array is "+sm);
       console.log("Find Multiple duplicates in array");
       var count=0;
       for(var i=0;i<a.length-1;i++,count=0){
for(var j=i+1;j<a.length;j++){
    if(a[i]==a[j]){
        count++;
    }
        }
        if(count>=2){
console.log("Multiple duplicate in array number is",a[i]);
}
       }
       console.log("Find Even number in array");
       console.log("Even number in array are");
       for(var i=0;i<a.length;i++){
           if(a[i]%2==0){
console.log(a[i]);
       }
    }
    console.log("Find odd number in array ");
    console.log("Odd number in array are");
    for(var i=0;i<a.length;i++){
if(a[i]%2!=0){
    console.log(a[i]);
}
    }
   console.log("Find element that is not repeated in array");
   console.log("Not repeated elements are");
   var dummy2=new Array();
       var dum2=0;
       for(var i=0;i<a.length-1;i++){
           for(var j=i+1;j<a.length;j++){
               if(a[i]===a[j]){
                   dummy2[dum2++]=a[i];
                  
               }
           }
       }
       var c=0;
       for(var k=0;k<a.length;k++,c=0){
        for(var j=0;j<dummy2.length;j++){
            if(dummy2[j]==a[k]){
                c++;
            }
       }
       if(c==0){
console.log(a[k]);
       }
    }
    console.log("Sort the array");
    console.log("Sorted array is ");
    var temp=0;
 for(var i=0;i<a.length-1;i++){
     for(var j=i+1;j<a.length;j++){
if(a[i]<a[j]){
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
}
     }
 }
 for(var i=0;i<a.length;i++){
     console.log(a[i]);
 }

