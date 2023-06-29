import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserComponent } from './user/user.component';
import { RegistrationComponent } from './user/registration/registration.component';
import { HomeComponent } from './home/home.component';
import { AuthGuard } from './auth/auth.guard';
import { NavbarComponent } from './navbar/navbar.component';
import { AccountsComponent } from './accounts/accounts.component';
import { VetFormComponent } from './pages/vet/vet-form/vet-form.component';
import { VetTableComponent } from './pages/vet/vet-table/vet-table.component';



const routes: Routes = [
  {path:'',redirectTo:'/user/registration',pathMatch:'full'},
  {
    path: 'user', component: UserComponent,
    children: [
      { path: 'registration', component: RegistrationComponent },
      { path: 'login', component: RegistrationComponent }
    ]
  },
  { path: 'home', component: HomeComponent, canActivate: [AuthGuard] },
  { path: 'vets-form', component: VetFormComponent, canActivate: [AuthGuard] },
  { path: 'vets-table', component: VetTableComponent, canActivate: [AuthGuard] },
  { path: 'accounts', component: AccountsComponent, canActivate: [AuthGuard] }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
