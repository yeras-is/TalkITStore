import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FormsModule} from '@angular/forms';
import {Routes, RouterModule} from '@angular/router';
import {NewServiceService} from './new-service.service';
import {HttpClientModule} from '@angular/common/http';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import {IndexComponent} from './index/index.component';
import {NotFoundComponent} from './not-found/not-found.component';
import {MarketComponent} from './market/market.component';
import {AboutComponent} from './about/about.component';
import {StatisticComponent} from './statistic/statistic.component';

const appRoutes: Routes = [
  {path: '', component: IndexComponent},
  {path: 'index', component: IndexComponent},
  {path: 'market', component: MarketComponent},
  {path: 'about', component: AboutComponent},
  {path: 'stat', component: StatisticComponent},
  {path: '**', component: NotFoundComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    NotFoundComponent,
    MarketComponent,
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
  providers: [NewServiceService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
