import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from '@angular/common/http';
import { StudentService } from './student.service';
import { HomeComponent } from './home/home.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { RequestedBookComponent } from './requested-book/requested-book.component';
import { AddBookComponent } from './add-book/add-book.component';
import { GetAllBookComponent } from './get-all-book/get-all-book.component';
import { LibLoginComponent } from './lib-login/lib-login.component';
import { LibRequestedBookComponent } from './lib-requested-book/lib-requested-book.component';
import { AboutComponent } from './about/about.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { ApprovedRejectedBookComponent } from './approved-rejected-book/approved-rejected-book.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    SearchBookComponent,
    RequestedBookComponent,
    AddBookComponent,
    GetAllBookComponent,
    LibLoginComponent,
    LibRequestedBookComponent,
    AboutComponent,
    UpdateBookComponent,
    ApprovedRejectedBookComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
