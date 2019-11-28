import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CarComponent } from './car/car.component';
import { ChildComponent } from './child/child.component';
import { BikeComponent } from './bike/bike.component';
import { MovieComponent } from './movie/movie.component';
import { LaptopComponent } from './laptop/laptop.component';
import { MobileComponent } from './mobile/mobile.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarComponent,
    ChildComponent,
    BikeComponent,
    MovieComponent,
    LaptopComponent,
    MobileComponent,
    LaptopChildComponent
  ],
  imports: [
    BrowserModule,
    // AppRoutingModule
    RouterModule.forRoot([
    
      {path : 'home', component : HomeComponent},
      {path : 'car', component : CarComponent},
      {path : 'laptop', component : LaptopComponent},
      {path : 'bike', component : BikeComponent},
      {path : 'movie', component : MovieComponent},
      {path : 'mobile', component : MobileComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
