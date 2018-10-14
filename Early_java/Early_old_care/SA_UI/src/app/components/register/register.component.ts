import { RegisterService } from './../../share/register/register.service';
import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  titlename :string; titlenames;
  fName:string; lName:string;
  nationality:string;  nationalities;
  ethnicity:string;  ethnicities;
  religion:string; religions;
  position:string; positions;
  status:string; statuss;

  constructor(private registerService: RegisterService) { }
  ngOnInit() {
    this.registerService.getTitleName().subscribe(titlename => {
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
    this.registerService.addNewUser(this.fName,this.lName).subscribe(
      data => {
        console.log("POST Request is successful ", data);
      },
      error => {
        console.log("Error", error);
      }
    );
  }
  onClear(){
  this.fName = this.lName = '';
}
}

export class FormFieldOverviewExample {}


