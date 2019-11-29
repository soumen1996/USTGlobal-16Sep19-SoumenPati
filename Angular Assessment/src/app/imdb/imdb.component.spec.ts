<<<<<<< HEAD
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ImdbComponent } from './imdb.component';

describe('ImdbComponent', () => {
  let component: ImdbComponent;
  let fixture: ComponentFixture<ImdbComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ImdbComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ImdbComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
=======
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ImdbComponent } from './imdb.component';

describe('ImdbComponent', () => {
  let component: ImdbComponent;
  let fixture: ComponentFixture<ImdbComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ImdbComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ImdbComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
>>>>>>> eb22e7daa35a667f97ae3f62b8d039b6b27bce46
