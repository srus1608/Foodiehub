import { Component, OnInit } from '@angular/core';
import { OrderApi } from '../../services/order';

@Component({
  selector: 'app-order',
  standalone: false,
  templateUrl: './order.html',
  styleUrl: './order.css'
})
export class Order implements OnInit {

  orders: any[] = [];

  // Form object
  orderObj: any = {
    restaurantId: 1,
    dishId: 1,
    quantity: 1
  };

  constructor(private api: OrderApi) {}

  ngOnInit(): void {
    this.loadOrders();
  }

  // Load all orders
  loadOrders() {
    this.api.getOrders().subscribe(
      res => this.orders = res,
      err => console.log(err)
    );
  }

  // Place new order
  placeOrder() {
  this.api.placeOrder(this.orderObj.restaurantId, this.orderObj.dishId, this.orderObj.quantity)
    .subscribe(res => {
      alert("Order placed successfully!");
      this.orderObj.quantity = 1;
      this.loadOrders();
    });
}

  
}
