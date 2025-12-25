import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root',
})
export class RestaurantApi {
  private baseUrl = "http://localhost:8080/api/restaurants";

  constructor(private http: HttpClient) { }

  // READ - Get all restaurants
  getAll(): Observable<any> {
    return this.http.get(this.baseUrl);
  }

  // CREATE - Add restaurant
  addRestaurant(data:any): Observable<any> {
    return this.http.post(this.baseUrl, data);
  }

}
