import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private http: HttpClient, private service: StudentService, private router: Router) {  }

  ngOnInit() {
    if ( sessionStorage.getItem('librarianBean') == null) {
      alert('~~~~ Login First ~~~~');
      this.router.navigate(['/lib-login']);
    }
  }

  addData(form: NgForm) {
    console.log(form.value);
    this.http.post(`${this.service.lmsURL}/add-book`, form.value).subscribe(resp => {
      if (resp === true) {
        if (confirm('Book Successfully Added!!! Add Again')) {
          this.router.navigate(['/add-book']);
        } else {
          this.router.navigate(['/home']);
        }
      } else {
        alert('Failed to register');
      }
    });
  }

}
