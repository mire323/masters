import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  readonly BaseURI = 'https://localhost:5001/api';

  constructor(private http: HttpClient) {

  }

  getTransactionById(id: number) {
    return this.http.get(this.BaseURI + '/Transactions/'+id);
  }

}
