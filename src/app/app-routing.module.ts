import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EmiPaymentComponent } from './emi-payment/emi-payment.component';
const routes: Routes = [
{path:'dashboard',component:DashboardComponent},
{path:'register',component:RegisterComponent},
{path:'login',component:LoginComponent},
{path:'emi-payment',component:EmiPaymentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
