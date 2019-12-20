import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  public lmsURL = 'http://localhost:8080/lms';
  public isStuLoggedIn = false;
  public isLibLoggedIn = false;
  public home = true;

  constructor(private http: HttpClient) { }

  isLibrarianLoggedIn() {
    if (this.isLibLoggedIn) {
      return true;
    }
    return false;
  }

  isStudentLoggedIn() {
    if (this.isStuLoggedIn) {
      return true;
    }
    return false;
  }

}
