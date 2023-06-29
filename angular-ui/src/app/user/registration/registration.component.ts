import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from '../state/customer.model';
import { UserService } from 'src/app/shared/services/user.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styles: []
})
export class RegistrationComponent implements OnInit {
  customer = {} as Customer;
  formModel = {
    UserName: '',
    Password: ''
  }
  constructor(public service: UserService, private toastr: ToastrService, private router: Router) { }

  ngOnInit() {
  }

  ngAfterViewInit() {
    var loginButton = document.getElementById("loginButton");
    var registerButton = document.getElementById("registerButton");
  
    loginButton.onclick = function () {
      document.querySelector("#flipper").classList.toggle("flip");
      return false;
    }
  
    registerButton.onclick = function () {
      document.querySelector("#flipper").classList.toggle("flip");
      return false;
    }
  }

  onSubmit() {
    console.log(this.customer);
    this.service.register(this.customer).subscribe(x => {
      this.service.formModel.reset();
      this.toastr.success('New user created!', 'Registration successful.');
    });
  }

  onSubmitLogin(form: NgForm) {
    const formData = {
      username: form.value.UserName,
      password: form.value.Password
    };
  
    this.service.login(form).subscribe(
      (res: any) => {
        console.log('Response:', res); // Log the response for debugging
          localStorage.setItem('token', res);
          this.router.navigateByUrl('/home');
          console.log('Login successful');
      },
      (err: any) => {
        console.log('Error:', err); // Log the error for debugging
        if (err.status === 401) {
          this.toastr.error('Incorrect username or password.', 'Authentication failed.');
        } else {
          console.log(err);
        }
      }
    );
  }
}
