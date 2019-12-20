import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-all-book',
  templateUrl: './get-all-book.component.html',
  styleUrls: ['./get-all-book.component.css']
})
export class GetAllBookComponent implements OnInit {
  studentBeans;
  sid;
  public getAllBook;
  constructor(private http: HttpClient, private service: StudentService, private router: Router) {  }

  ngOnInit() {
    if ( sessionStorage.getItem('studentBean') == null) {
      alert('~~~~ Login First ~~~~');
      this.router.navigate(['/login']);
    }

    this.studentBeans = Array.of((JSON.parse(sessionStorage.getItem('studentBean'))));
    this.sid = this.studentBeans[0].sid;

    this.http.get(`${this.service.lmsURL}/get-all-book`).subscribe(response => {
      if (response !== null) {
        this.getAllBook = response;
      } else {
        alert('Book Not Available');
      }
    });
  }

  requestBook(bid) {
    console.log(bid);
    this.http.get(`${this.service.lmsURL}/request-book/${this.sid}/${bid}`).subscribe(response => {
      if (response === 1) {
        alert('~~~~ Requested Succefully ~~~~');
      } else if (response === 0) {
        alert('~~~ Book Already Requested ~~~~');
      } else if (response === -1) {
        alert('~~~~ Falied To Request Book ~~~~');
      }
    });
  }

}
