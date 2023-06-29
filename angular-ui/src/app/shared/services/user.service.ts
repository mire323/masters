import { Injectable } from '@angular/core';
import { FormBuilder, Validators, FormGroup, FormsModule, ReactiveFormsModule, NgForm } from '@angular/forms';
import { HttpClient } from "@angular/common/http";
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Customer } from 'src/app/user/state/customer.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private fb: FormBuilder, private http: HttpClient) { }
  readonly BaseURI = environment.apiUrl;

  formModel = this.fb.group({
    UserName: ['', Validators.required],
    Email: ['', Validators.email],
    FirstName: [''],
    LastName: [''],
    Passwords: this.fb.group({
      Password: ['', [Validators.required, Validators.minLength(4)]],
      ConfirmPassword: ['', Validators.required]
    }, { validator: this.comparePasswords })
  });

  comparePasswords(fb: FormGroup) {
    let confirmPswrdCtrl = fb.get('ConfirmPassword');
    if (confirmPswrdCtrl.errors == null || 'passwordMismatch' in confirmPswrdCtrl.errors) {
      if (fb.get('Password').value !== confirmPswrdCtrl.value)
        confirmPswrdCtrl.setErrors({ passwordMismatch: true });
      else
        confirmPswrdCtrl.setErrors(null);
    }
  }

  register(customer: Customer): Observable<any> {
    const body = {
      userName: customer.userName,
      firstName: customer.firstName,
      lastName: customer.lastName,
      email: customer.email,
      password: this.encryptPassword(customer.password)
    };
    return this.http.post(`${this.BaseURI}/customers`, body);
  }

  login(formData: NgForm): Observable<any> {
    const loginRequest = {
      username: formData.value.UserName,
      password: formData.value.Password
    };
  
    return this.http.post(`${this.BaseURI}/customers/login`, loginRequest);
  }

  private encryptPassword(password: string): string {
    // Implement your password encryption logic here
    // Example: You can use a library like bcrypt to hash the password
    // Ensure to follow best practices for password hashing and use a strong hashing algorithm
    // This example uses a simple base64 encoding, which is not recommended for production use
    const encodedPassword = btoa(password);
    return encodedPassword;
  }
}
