<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  get email() {
    return this.form.get('email');
}
get password() {
  return this.form.get('password');
}
  form = new FormGroup({
    email: new FormControl('', [Validators.required]), /* Two argument one is form state, validation message */
    password: new FormControl('', [Validators.required])
  });


  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
  console.log(form);
  }
=======
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  get email() {
    return this.form.get('email');
}
get password() {
  return this.form.get('password');
}
  form = new FormGroup({
    email: new FormControl('', [Validators.required]), /* Two argument one is form state, validation message */
    password: new FormControl('', [Validators.required])
  });


  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
  console.log(form);
  }
>>>>>>> eb22e7daa35a667f97ae3f62b8d039b6b27bce46
}