const item=[
    {
        name:'Earing',
        id:1,
        price:5000,
    },

    {
        name:'Kajal',
        id:2,
        price:1000,
    },

    {
        name:'Trimmer',
        id:3,
        price:3000,

    },

    {
        name:'Beardo',
        id:4,
        price:170,
    }

];

const updatedItem= item.map(function(items,index){
    items.price=items.price+300;

    return items;
})

console.log(updatedItem);

const itemsArrow=item.map((value)=>
{
    value.price=value.price+300
    return value;
})
console.log(itemsArrow);

const item2=item.filter((value)=>value.price>1000);
console.log(item2);