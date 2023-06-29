import { Component, OnInit } from '@angular/core';
import { AccountsService } from '../shared/services/accounts.service';

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.scss']
})
export class AccountsComponent implements OnInit {
  accounts = null;
  constructor(private accountService: AccountsService) { }
  ngOnInit() {
    this.accountService.getAccounts().subscribe(res => {
      this.accounts = res;
    });
  }

}
