var no=[45,98,34,16]
no.forEach(function(values,index) {
    console.log(values);
    console.log(index);
    
})

var movies=['Sholay','Mayabazar','Jurassic Park','Titanic']
movies.forEach(function(values,index){
    console.log('Movie =',values)
    console.log('Movie Index=',index)
})

var brands=['kingfisher','bisleri','aqua','kinley']
brands.forEach(function(values,index)
{
    console.log('Brand',values);
    console.log('Index',index);
})

var items=[{
    item:'Bangles',
    id:1,
    price:100
    },
    {item:'EyeLiner',
    id:2,
    price:500},

    {
    items:'Watch',
    id:3,
    price:5000
    },
    {
    items:'Bike',
    id:4,
    price:100000
    }
    ]

items.forEach(function(item,index)
{
    console.log('items:',item);
    console.log('index:',index);

})

var state=['Kerala','Karnataka','Rajsthan','West Bengal']
state.forEach(function(state,index)
{
    console.log('state:',state);
    console.log('index:',index);
})

var laptop=new Object();
laptop.brands='Dell';
laptop.price=49999;
laptop.processor='i5 th gen';

laptop.forEach(function(laptop,index)
{
    console.log('Laptop',laptop);
})