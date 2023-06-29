import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as $ from 'jquery';
import { UserService } from '../shared/services/user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styles: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router,public service: UserService) { }

  ngAfterViewInit() {
    $('.menu').click (function(){
      $(this).toggleClass('open');
    });
  }

  ngOnInit() {
  }


  onLogout() {
    localStorage.removeItem('token');
    this.router.navigate(['/user/login']);
  }
}
