import { Pipe, PipeTransform } from '@angular/core';
import { AccountType } from '../enums/account-type.enum';

@Pipe({
  name: 'accountType'
})
export class AccountTypePipe implements PipeTransform {

  transform(value: any, ...args: any): any {
    switch (value) {
      case AccountType.DINARSKI:
        return 'Dinarski';
      case AccountType.DEVIZNI:
        return 'Devizni';
    }
    }
  }


