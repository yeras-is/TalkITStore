import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-statistic',
  templateUrl: './statistic.component.html',
  styleUrls: ['./statistic.component.css']
})
export class StatisticComponent implements OnInit {
  constructor() {
  }

  books: any[] = [
    {
      name: 'Gang of Fourth',
      value: 9000
    },
    {
      name: 'Spring in Action',
      value: 7000
    },
    {
      name: 'Lorem ipsum',
      value: 6500
    },
    {
      name: 'Lorem ipsum',
      value: 5500
    },
    {
      name: 'Lorem ipsum',
      value: 4500
    },
    {
      name: 'Lorem ipsum',
      value: 3500
    }
  ];

  ngOnInit() {
  }

}
