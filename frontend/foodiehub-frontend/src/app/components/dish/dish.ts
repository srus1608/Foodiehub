import { Component, OnInit } from '@angular/core';
import { DishApi } from '../../services/dish';

@Component({
  selector: 'app-dish',
  standalone: false,
  templateUrl: './dish.html',
  styleUrl: './dish.css'
})
export class Dish implements OnInit {

  // Variables for table and form
  restaurantId: number = 1; // default restaurant
  dishes: any[] = [];

  dishObj: any = {
    restaurantId: 1,
    name: '',
    price: 0,
    category: ''
  };

  constructor(private api: DishApi) {}

  ngOnInit(): void {
    this.loadDishes();
  }

  // Load dishes from backend
  loadDishes() {
    this.api.getByRestaurant(this.restaurantId).subscribe(
      res => this.dishes = res,
      err => console.log(err)
    );
  }

  // Add new dish
  saveDish() {
  this.dishObj.restaurantId = this.restaurantId;
  this.api.addDish(this.dishObj).subscribe(
    res => {
      alert("Dish added successfully!");
      this.dishObj.name = '';
      this.dishObj.price = 0;
      this.dishObj.category = '';
      this.loadDishes();
    }
  );
}

}