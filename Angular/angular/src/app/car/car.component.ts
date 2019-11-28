import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  selectedCar;

  Cars = [
    {
      name : 'Maruthi',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
    },
    {
      name : 'Suzuki',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
    },
    {
      name : 'Lamborghini',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
    },
    {
      name : 'BMW',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
    },
    {
      name : 'Lamborghini Aventador',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
    },
    {
      name : 'Audi A3',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
    },
    {
      name : 'Ferrari 812 superfast',
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/12/56/ford-mustang-146580__340.png',
    },
    {
      name : 'Bugatti La Voiture Noire',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/04/06/22/11/auto-2209439__340.png',
    },
    {
      name : 'Mercedes-Benz E-Class',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
    },
    {
      name : 'Audi RS3',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/12/07/21/50/audi-1890494__340.jpg',
    }
  ]

  constructor() { }

  ngOnInit() {
  }

  sendCar(car){
    console.log(car);
    this.selectedCar = car;
  }

}
