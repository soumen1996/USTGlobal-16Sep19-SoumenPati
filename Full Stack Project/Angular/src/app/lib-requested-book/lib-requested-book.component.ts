import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lib-requested-book',
  templateUrl: './lib-requested-book.component.html',
  styleUrls: ['./lib-requested-book.component.css']
})
export class LibRequestedBookComponent implements OnInit {
  // currentStatus = 0;
  librarianBeans;
  getAllReceivedRequestedBook;
  lid;
  constructor(private http: HttpClient, private service: StudentService, private router: Router) {  }

  ngOnInit() {
    if ( sessionStorage.getItem('librarianBean') == null) {
      alert('~~~~ Login First ~~~~');
      this.router.navigate(['/lib-login']);
    }

    this.librarianBeans = Array.of((JSON.parse(sessionStorage.getItem('librarianBean'))));
    this.lid = this.librarianBeans[0].lid;

    this.http.get(`${this.service.lmsURL}/get-all-received-requested-book`).subscribe(response => {
      if (response !== null) {
        console.log(response);
        this.getAllReceivedRequestedBook = response;
      } else {
        alert('No Received Requested Available');
        this.router.navigate(['/home']);
      }
    });
  }

  actionOnBook(tid, sValue, bid) {
    console.log(tid, sValue);
    this.http.get(`${this.service.lmsURL}/action-on-requested-book/${tid}/${sValue}/${bid}`).subscribe(response => {
      if (response === 1) {
        alert('~~~~ Book Approved ~~~~');
      } else if (response === -1) {
        alert('~~~~ Book Rejected ~~~~');
      } else {
        alert('~~~~ Something Went Wrong ~~~~');
      }
    });
  }

  // returnBook(bid) {
  //   this.http.get(`${this.service.lmsURL}/return-book/${this.sid}/${bid}`).subscribe(response => {
  //     if (response === 1) {
  //       console.log(response);
  //       alert('~~~~ Book Returned ~~~~');
  //       this.router.navigate(['/requested-book']);
  //     } else {
  //       alert('~~~~ Failed To Return Book ~~~~');
  //     }
  //   });
  // }

}
