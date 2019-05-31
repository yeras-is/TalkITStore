import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-market',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  constructor() {
  }


  books: any[] = [
    {
      name: 'Gang of Fourth',
      cost: 10000,
      about: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Spring in Action',
      cost: 2000,
      about: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 3000,
      about: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 5000,
      about: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 6000,
      about: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    },
    {
      name: 'Lorem ipsum',
      cost: 17000,
      about: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, numquam.'
    }
  ];

  ngOnInit() {
  }

}
