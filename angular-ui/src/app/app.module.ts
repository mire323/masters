import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HTTP_INTERCEPTORS} from "@angular/common/http";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToastrModule } from 'ngx-toastr';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { RegistrationComponent } from './user/registration/registration.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AuthInterceptor } from './auth/auth.interceptor';
import { ReactiveFormsModule, FormsModule } from "@angular/forms";
import * as $ from 'jquery';
import{ NgbModule } from "@ng-bootstrap/ng-bootstrap";
import { CommonModule } from '@angular/common';  
import { Ng2SmartTableModule } from 'ng2-smart-table';
import { AccountsComponent } from './accounts/accounts.component';
import { AccountTypePipe } from './pipes/account-type.pipe';
import { AccountNumberPipe } from './pipes/account-number.pipe';
import { HttpModule } from '@angular/http';
import { SideNavComponent } from './shared/components/side-nav/side-nav.component';
import { VetFormComponent } from './pages/vet/vet-form/vet-form.component';
import { VetTableComponent } from './pages/vet/vet-table/vet-table.component';
import { UserService } from './shared/services/user.service';





@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    RegistrationComponent,
    HomeComponent,
    NavbarComponent,
    AccountsComponent,
    AccountTypePipe,
    AccountNumberPipe,
    SideNavComponent,
    VetFormComponent,
    VetTableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot({
      positionClass: 'toast-top-right',
      progressAnimation: 'decreasing',
      preventDuplicates: true,
      progressBar: true,
    }),
    NgbModule,
    FormsModule,
    CommonModule,
    HttpModule,
    ReactiveFormsModule,
    Ng2SmartTableModule
  ],
  providers: [UserService, {
    provide: HTTP_INTERCEPTORS,
    useClass: AuthInterceptor,
    multi: true
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
