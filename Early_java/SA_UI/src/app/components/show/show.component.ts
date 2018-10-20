import { Component, OnInit, ViewChild } from '@angular/core';
import {MatPaginator, MatTableDataSource} from '@angular/material';
import { ShowService } from 'src/app/share/register/show.service';

export interface Profile{
profileId:number;
titlename:string;
firstName:string;
lastName:String;
position:String;
email:String;
phone:String;
}
@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})

export class ShowComponent implements OnInit {
  displayedColumns: string[] = ['profileId', 'titlename', 'firstName','lastName','email','phone'];
  dataSource:any;
  profiles: Array<any>;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  
  constructor(private showService: ShowService) { }
  

  ngOnInit() {
   
  }
  getProfileList(){
    this.showService.getProfile().subscribe(data => {
    this.profiles = data;
    const profileList:Profile[] = [];
    console.log(this.profiles);
    

    for (let index = 0; index < this.profiles["length"]; index++) {

      profileList.push({
        profileId: this.profiles[index].profileId,
        titlename: this.profiles[index].titlename.titlename,
        firstName: this.profiles[index].firstName,
        lastName: this.profiles[index].lastName,
        position: this.profiles[index].position.position,
        email:this.profiles[index].email,
        phone:this.profiles[index].phone,
      })
      }  
      this.dataSource = new MatTableDataSource(profileList);
      this.dataSource.paginator = this.paginator;
    });
  }

}