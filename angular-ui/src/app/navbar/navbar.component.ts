import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../shared/services/user.service';


@Component({
 selector: 'app-navbar',
 templateUrl: './navbar.component.html',
 styleUrls: ['./navbar.component.scss']
})

export class NavbarComponent implements OnInit {
 constructor(private router: Router, private service: UserService) { }
 
 ngOnInit() {
   
 }
}
