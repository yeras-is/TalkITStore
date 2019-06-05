import {BrowserModule} from '@angular/platform-browser';
import { NgModule} from '@angular/core';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FormsModule} from '@angular/forms';
import {Routes, RouterModule} from '@angular/router';
import {NewServiceService} from './new-service.service';
import {HttpClientModule} from '@angular/common/http';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import {HomeComponent} from './home/home.component';
import {NotFoundComponent} from './not-found/not-found.component';
import {BooksComponent} from './books/books.component';
import {AboutComponent} from './about/about.component';
import {StatisticComponent} from './statistic/statistic.component';
import {BooksService} from './service/books.service';

const appRoutes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'books', component: BooksComponent},
  {path: 'about', component: AboutComponent},
  {path: 'stat', component: StatisticComponent},
  {path: '**', component: NotFoundComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NotFoundComponent,
    BooksComponent,
    AboutComponent,
    StatisticComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
    NgbModule
  ],
  providers: [BooksService],
  bootstrap: [AppComponent]
})
export class AppModule {

}
