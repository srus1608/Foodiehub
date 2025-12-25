import { Component, OnInit } from '@angular/core';
import { RestaurantApi } from '../../services/restaurant';

@Component({
  selector: 'app-restaurant',
  standalone: false,
  templateUrl: './restaurant.html',
  styleUrl: './restaurant.css',
})
export class Restaurant implements OnInit {

  // Stores all restaurants
  restaurants: any[] = [];

  // Object for add form
  restaurantObj: any = {
    name: '',
    location: '',
    cuisine: ''
  };

  constructor(private api: RestaurantApi) {}

  ngOnInit(): void {
    this.loadRestaurants();
  }

  // Load all restaurants from backend
  loadRestaurants() {
    this.api.getAll().subscribe(res => {
      this.restaurants = res;
    });
  }

  // Add new restaurant
  saveRestaurant() {
    this.api.addRestaurant(this.restaurantObj).subscribe(res => {
      alert("Restaurant Added!");
      this.restaurantObj = { name: '', location: '', cuisine: '' }; // reset form
      this.loadRestaurants(); // refresh list
    });
  }
}
