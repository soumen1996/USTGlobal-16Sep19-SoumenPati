import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {

  selectedLaptop;

  Laptops = [
    {
      name : 'Asus ROG Gaming',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
    },
    {
      name : 'HP Pavillion',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
    },
    {
      name : 'Dell Vostro',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
    },
    {
      name : 'Apple Macbook air',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
    },
    {
      name : 'Toshiba',
      imgUrl : 'https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/TOSHIBA_Satellite_Pro_L850/TOSHIBA_Satellite_Pro_L850_L_1.jpg',
    },
    {
      name : 'Acer',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/05/31/10/51/acer-791027__340.jpg',
    },
    {
      name : 'Microsoft surface pro 4',
      imgUrl : 'https://cdn.pixabay.com/photo/2019/06/15/09/26/laptop-4275110__340.jpg',
    },
    {
      name : 'Lenovo',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/11/12/15/48/tablet-pc-528464__340.jpg',
    },
    {
      name : 'Sony',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/09/07/05/41/surface-book-3659999__340.jpg',
    },
    {
      name : 'Dell Desktop',
      imgUrl : 'https://image.shutterstock.com/image-vector/desktop-pc-blank-screen-perspective-260nw-778939729.jpg',
    }
  ]

  constructor() { }

  ngOnInit() {
  }

  sendLaptop(laptop){
    console.log(laptop);
    this.selectedLaptop = laptop;
  }

}
