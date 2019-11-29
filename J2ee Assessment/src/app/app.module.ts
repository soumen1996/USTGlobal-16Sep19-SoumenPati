import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { ImdbComponent } from './imdb/imdb.component';
import { MoviesComponent } from './movies/movies.component';
import { AddmoviesComponent } from './addmovies/addmovies.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ImdbComponent,
    MoviesComponent,
    AddmoviesComponent,
    LoginComponent

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'imdb', component : ImdbComponent},
      {path : 'movies', component : MoviesComponent},
      {path : 'addmovie', component : AddmoviesComponent},
      {path : 'login', component : LoginComponent}
    
      ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
