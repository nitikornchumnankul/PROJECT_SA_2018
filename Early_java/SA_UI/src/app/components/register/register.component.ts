import { HttpClient } from '@angular/common/http';
import { RegisterService } from './../../share/register/register.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})

export class RegisterComponent implements OnInit {
  Titlename: Array<any>;
  Status: Array<any>;
  Religion: Array<any>;
  Position: Array<any>;
  Nationality: Array<any>;
  Ethnicity: Array<any>;
  Sex:Array<any>;
  view: any={
    firstname:'',
    lastname:'',
    sex: '',
    identification:'',
    phone:'',
    email:'',
    titlename:'',
    nationality:'',
    ethnicity:'',
    religion:'',
    position:'',
    status:''
  }
  
  constructor(private registerService: RegisterService, private httpClient: HttpClient ) { }
  ngOnInit() {
    this.registerService.getTitlename().subscribe(titlename => {
      this.Titlename = titlename;
      console.log(this.Titlename);
    });

    this.registerService.getNationality().subscribe(nationality => {
      this.Nationality = nationality;
      console.log(this.Nationality);
    });

    this.registerService.getEthnicity().subscribe(ethnicity => {
      this.Ethnicity = ethnicity;
      console.log(this.Ethnicity);
    });

    this.registerService.getReligion().subscribe(religion => {
      this.Religion = religion;
      console.log(this.Religion);
    });
    this.registerService.getPosition().subscribe(position => {
      this.Position = position;
      console.log(this.Position);
    });
    this.registerService.getStatus().subscribe(status => {
      this.Status = status;
      console.log(this.Status);
    });

    this.registerService.getSex().subscribe(sex => {
      this.Sex = sex;
      console.log(this.Sex);
    });

   
  

  }
  onSave(){
    this.httpClient.get('http://localhost:8080/newProfile/'+ this.view.firstname + '/' + this.view.lastname + '/' + this.view.sex + '/' + this.view.identification + '/' + this.view.phone + '/' + this.view.email + '/' + this.view.titlename + '/' + this.view.nationality + '/' + this.view.ethnicity + '/' + this.view.religion + '/' + this.view.position + '/' + this.view.status,this.view)
    .subscribe
    (
      data =>{
      alert('บันทึกเรียบร้อย');
      console.log('Post Request is seccessful',data);
    },
    error=>{
      console.log('Rrror',error);
      alert('ไม่สามารถบันทึกได้ โปรดกรุณาใส่ข้อมูลให้ครบถ้วน');
    }
    );
  }
}




