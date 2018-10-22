import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient } from '@angular/common/http';
import { Profile } from 'src/app/components/show/show.component';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  public API = '//localhost:8080';
  private serviceUrl = 'http://localhost:8080/Profile';
  constructor(private http: HttpClient) { }

  getTitlename(): Observable<any> {
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

  getSex():Observable<any> {
    return this.http.get(this.API + '/Sex');
  }

  getnewProfile():Observable<any> {
    return this.http.get(this.API + '/newProfile');
  }

  getShow():Observable<Profile[]>{
    return this.http.get<Profile[]>(this.serviceUrl);
  }
}
