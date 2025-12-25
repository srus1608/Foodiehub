import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dish } from './dish';

describe('Dish', () => {
  let component: Dish;
  let fixture: ComponentFixture<Dish>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Dish]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Dish);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
