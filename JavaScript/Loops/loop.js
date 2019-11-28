// var brands=['kingfisher','bisleri','aqua','kinley']
// console.log('for of loop')
// for(var element of brands)
// {
//     console.log('Brand=',element)
// }

// console.log('==============')


// var brands=['kingfisher','bisleri','aqua','kinley']
// console.log('for in loop')
// for(var index in brands){
//     console.log('Brand=',brands[index]);
// }

// console.log('==============')

// var movies=['Sholay','Mayabazar','Jurassic Park','Titanic']
// movies.forEach(function(values,index){
//     console.log('Movie =',values)
//     console.log('Movie Index=',index)
// })

// console.log('==============')

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

    items.forEach(function(item,index){
        console.log('Items:',item)
        console.log('Index of Item',index)
    })