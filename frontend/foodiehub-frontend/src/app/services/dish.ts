import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DishApi {

  // private baseUrl = "http://localhost:8080/api/dishes";
  private baseUrl ="http://ec2-98-82-32-22.compute-1.amazonaws.com:8080/api/dishes";

  constructor(private http: HttpClient) {}

  // GET dishes by restaurant
  getByRestaurant(restaurantId: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/restaurant/${restaurantId}`);
  }

  // POST create a dish
  addDish(data:any): Observable<any> {
    return this.http.post(this.baseUrl, data);
  }
}
