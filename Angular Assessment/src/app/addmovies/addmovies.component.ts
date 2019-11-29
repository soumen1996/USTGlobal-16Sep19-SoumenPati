<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {

  get movie(){
    return this.form.get('movie');
  }
  get url(){
    return this.form.get('url');
  }

  get desc(){
    return this.form.get('desc');
  }


  form = new FormGroup({
    movie : new FormControl('',[Validators.required,]),
    url : new FormControl('',[Validators.required]),
    desc : new FormControl('',[Validators.required])
  })
  

  constructor() { }

  ngOnInit() {
  }

  moviesData(form){
    console.log(form)
  }


}
=======
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {

  get movie(){
    return this.form.get('movie');
  }
  get url(){
    return this.form.get('url');
  }

  get desc(){
    return this.form.get('desc');
  }


  form = new FormGroup({
    movie : new FormControl('',[Validators.required,]),
    url : new FormControl('',[Validators.required]),
    desc : new FormControl('',[Validators.required])
  })
  

  constructor() { }

  ngOnInit() {
  }

  moviesData(form){
    console.log(form)
  }


}
>>>>>>> eb22e7daa35a667f97ae3f62b8d039b6b27bce46
