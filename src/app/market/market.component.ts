import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-market',
  templateUrl: './market.component.html',
  styleUrls: ['./market.component.css']
})
export class MarketComponent implements OnInit {

  constructor() {
  }


  books: any[] = [
    {
      name: 'Gang of Fourth',
      cost: 10000,
      value: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Spring in Action',
      cost: 2000,
      value: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 3000,
      value: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 5000,
      value: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 6000,
      value: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 17000,
      value: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    }
  ];

  ngOnInit() {
  }

}
