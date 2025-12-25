import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Restaurant } from './components/restaurant/restaurant';
import { Dish } from './components/dish/dish';
import { Order } from './components/order/order';

const routes: Routes = [
  { path: 'restaurants', component: Restaurant },
  { path: 'dishes', component: Dish },
  { path: 'orders', component: Order },
  { path: '', redirectTo: 'restaurants', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
