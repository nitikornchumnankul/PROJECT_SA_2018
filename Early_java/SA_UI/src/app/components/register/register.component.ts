import { HttpClient } from '@angular/common/http';
import { RegisterService } from './../../share/register/register.service';
import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  titlename=''; titlenames;
  nationality='';  nationalities;
  ethnicity='';  ethnicities;
  religion=''; religions;
  position=''; positions;
  status=''; statuss;

  firstname=''; 
  lastname='';
  sex='';
  identification='';
  phone='';
  email='';
  


  



  constructor(private registerService: RegisterService, private httpClient: HttpClient) { }
  ngOnInit() {
    this.registerService.getTitlename().subscribe(titlename => {
      this.titlenames = titlename;
      console.log(this.titlenames);
    });

    this.registerService.getNationality().subscribe(nationality => {
      this.nationalities = nationality;
      console.log(this.nationalities);
    });

    this.registerService.getEthnicity().subscribe(ethnicity => {
      this.ethnicities = ethnicity;
      console.log(this.ethnicities);
    });

    this.registerService.getReligion().subscribe(religion => {
      this.religions = religion;
      console.log(this.religions);
    });
    this.registerService.getPosition().subscribe(position => {
      this.positions = position;
      console.log(this.positions);
    });
    this.registerService.getStatus().subscribe(status => {
      this.statuss = status;
      console.log(this.statuss);
    });
    

  }
  onSave(){
    this.httpClient.post('http://localhost:8080/newProfile',{
     
      "firstName":this.firstname,
      "lastName":this.lastname,
      "sex":this.sex,
      "identificationnumber":this.identification,
      "email":this.email,
      "phone":this.phone,
      "religion":this.religion,
      "position":this.position,
      "titlename":this.titlename,
      "status":this.status,
      "nationality":this.nationality,
      "ethnicity":this.ethnicity
   
     
     
    }).subscribe(data =>{
      alert('บันทึกเรียบร้อย');
      console.log('Post Request is seccessful',data);
    },
    error=>{
      console.log('Rrror',error);
      alert('ไม่สามารถบันทึกได้');
    }
    );
  }

  
}

export class FormFieldOverviewExample {}


