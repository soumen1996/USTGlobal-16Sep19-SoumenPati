import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { RequestedBookComponent } from './requested-book/requested-book.component';
import { AddBookComponent } from './add-book/add-book.component';
import { GetAllBookComponent } from './get-all-book/get-all-book.component';
import { LibLoginComponent } from './lib-login/lib-login.component';
import { LibRequestedBookComponent } from './lib-requested-book/lib-requested-book.component';
import { AboutComponent } from './about/about.component';
import { ApprovedRejectedBookComponent } from './approved-rejected-book/approved-rejected-book.component';


const routes: Routes = [
  {path : 'login', component : LoginComponent},
  {path : 'register', component: RegisterComponent},
  {path : 'home', component: HomeComponent},
  {path : 'search-book', component: SearchBookComponent},
  {path : 'requested-book', component: RequestedBookComponent},
  {path : 'add-book', component: AddBookComponent},
  {path : 'get-all-book', component: GetAllBookComponent},
  {path : 'lib-login', component: LibLoginComponent},
  {path : 'lib-requested-book', component: LibRequestedBookComponent},
  {path : 'about', component: AboutComponent},
  {path : 'approved-rejected-book', component: ApprovedRejectedBookComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
