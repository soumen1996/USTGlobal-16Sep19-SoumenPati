import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchnewsComponent } from './searchnews/searchnews.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CountriesComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchnewsComponent
  ],
  imports: [
    BrowserModule, 
    RouterModule.forRoot([
    {path : 'home', component : HomeComponent},
    {path : 'countries', component : CountriesComponent},
    {path : 'categories', component : CategoriesComponent},
    {path : 'sources', component : SourcesComponent},
    {path : 'searchnews', component : SearchnewsComponent}
    ])
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
