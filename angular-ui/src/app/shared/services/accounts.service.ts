import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AccountsService {

  readonly BaseURI = 'https://localhost:5001/api';

  constructor(private http: HttpClient) {
    
   }

  getAccounts() {
    return this.http.get(this.BaseURI + '/Accounts');
  }
  getAccountById(id: number) {
    return this.http.get(this.BaseURI + '/Accounts/' + id);
  }

}
