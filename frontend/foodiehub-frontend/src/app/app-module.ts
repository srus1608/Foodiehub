import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Restaurant } from './components/restaurant/restaurant';
import { Dish } from './components/dish/dish';
import { Order } from './components/order/order';
import { HttpClientModule } from '@angular/common/http';
import { RestaurantApi } from './services/restaurant';
import { DishApi } from './services/dish';
import { OrderApi } from './services/order';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    App,
    Restaurant,
    Dish,
    Order
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],

  providers: [
    provideBrowserGlobalErrorListeners(),
    RestaurantApi,
    DishApi,
    OrderApi
  ],
  bootstrap: [App]
})
export class AppModule { }
