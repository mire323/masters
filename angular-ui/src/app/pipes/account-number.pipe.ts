import { Pipe, PipeTransform } from '@angular/core';
import { Subject } from 'rxjs';
import { AccountsService } from '../shared/services/accounts.service';

@Pipe({
  name: 'accountNumber'
})
export class AccountNumberPipe implements PipeTransform {
  service: AccountsService;

  constructor(service: AccountsService) {
    this.service = service;
  }
  transform(id: number): Subject<Object> {
    let numberSubject = new Subject<string>();

    this.service.getAccountById(id)
      .subscribe(
        (account) => {
          let number = JSON.parse(JSON.stringify(account)).number;
          numberSubject.next(number);
        });
    return numberSubject;
  }
}


