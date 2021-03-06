import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  addForm:FormGroup;
  url:string="";


  constructor(private http:HttpClient,private formBuilder:FormBuilder) { 

  }

  ngOnInit() {
    this.addForm=this.formBuilder.group({
      username:[''],
      password:[''],
      customerName:[''],
      customerDob:[''],
      customerEmailId:[''],
      customerPhoneNo:[''],
      customerAnnualIncome:[''],
      customerAddress:[''],
      cardType:[''],
      customerBankName:[''],
      customerSavingsAccount:[''],
      customerIfscCode:[''],

      
    })
  }
  addCustomer():void
  {
    alert('add customer');
    this.http.post(this.url,this.addForm.value).subscribe(data=>{
      alert('customer is added');
    })
  }

}
