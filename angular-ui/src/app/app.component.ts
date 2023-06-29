import { Component, OnInit } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { UserService } from './shared/services/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
  userDetails;
  showNavbar = false;

  constructor(private service: UserService, private router: Router) {
  }
  ngOnInit(): void {
    this.router.events.subscribe((val) => {
      this.showNavbar = !!localStorage.getItem('token');
    });
  }

  deleteUserDetails(isDeleted) {
    if (isDeleted) this.userDetails = null;
  }

}
