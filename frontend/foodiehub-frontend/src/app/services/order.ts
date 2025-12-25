import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderApi {

  // private baseUrl = "http://localhost:8080/api/orders";
  private baseUrl ="http://ec2-98-82-32-22.compute-1.amazonaws.com:8080/api/orders";

  constructor(private http: HttpClient) {}

  // PLACE ORDER (restaurant + dish + qty)
  placeOrder(restaurantId:number, dishId:number, quantity:number): Observable<any> {
    return this.http.post(`${this.baseUrl}?restaurantId=${restaurantId}&dishId=${dishId}&quantity=${quantity}`, {});
  }

  // GET ALL ORDERS
  getOrders(): Observable<any> {
    return this.http.get(this.baseUrl);
  }
}
