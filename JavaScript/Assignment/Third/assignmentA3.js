var player=['dhoni','virat','jadeja','rohit'];
for (var key in player) {

    console.log(player[key]);
     
}

var phone={ modelName:"k20 pro",
            processor:"Sd 850",
            price:27999,
            color:"Nubia Red",
}

for (var key in phone) {
    console.log(phone[key]);
}

var no=[12,96,15,36,57]
for(var key in no)
{
    if(no[key]%2==0)
    {
        console.log(no[key]);
    }
}

var words=['a','b',,'d','e']
for (var key in words) {
    console.log(words[key]);
}

var lifePartner={firstName:'baisakhi',
lastName:'chakraborty',
age:23,
phoneno:8001285202,
}
for(var key in lifePartner)
{
    console.log(lifePartner[key]);
}

var actress=['samantha','shruti hasan','cathlyn teressa']
for(var key in actress)
{
    console.log(actress[key]);
}

var a=[10,40,50,20,60,30,90,80,50,30,71,20,50];
for(var i in a){
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
for(var i in a){
if(n<a[i]){
n=a[i];
}
}
console.log("Biggest number in array is ",n);
console.log("Find second biggest number in array");
var f=a[0],s=0;
for(var i in a){
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
for(var i in a){
    if(sm>a[i]){
sm=a[i];
    }
}
console.log("Smallest number in array is "+sm);
console.log("Find Multiple duplicates in array");
var count=0;
for(var i=0;i<a.length-1;i++){
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
var car={
   brand:'Toyta',
   namee:'Innova',
   price:200000
};
for(let i in car){
console.log(car[i]);
}
var flower={
   name:'rose',
   price:30
};
for(let i in flower){
console.log(flower[i]);
}
var bike={
   name:'R15',
   price:15000
}
for(let i in bike){
console.log(bike[i]);
}
var bag={
   name:'skybag',
   price:1500
}
for(let i in bag){
console.log(bag[i]);
}
var mobile={
   name:'note pro',
   price:15000
}
for(let i in mobile){
console.log(mobile[i]);
}