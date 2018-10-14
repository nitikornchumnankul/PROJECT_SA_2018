import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  public API = '//localhost:8080';

  constructor(private http: HttpClient) { }

  getTitleName(): Observable<any> {
    return this.http.get(this.API + '/Titlename');
  }
  
  getStatus(): Observable<any> {
    return this.http.get(this.API + '/Status');
  }

  getNationality():Observable<any> {
    return this.http.get(this.API + '/Nationality');
  }

  getEthnicity():Observable<any> {
    return this.http.get(this.API + '/Ethnicity');
  }

  getReligion():Observable<any> {
    return this.http.get(this.API + '/Religion');
  }

  getPosition():Observable<any> {
    return this.http.get(this.API + '/Position');
  }

  addNewUser(fName:string,lName:string){
    return this.http.post(this.API + '/Profile/'+fName+'/'+lName,{
      "firstName":fName,
      "lastName":lName,
    });
  }
}
