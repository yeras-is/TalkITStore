import {Component} from '@angular/core';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  isCollapsed = true;
  isAuth = true;

  constructor(private modalAuth: NgbModal) {
  }

  open(content) {
    this.modalAuth.open(content);
  }
}
