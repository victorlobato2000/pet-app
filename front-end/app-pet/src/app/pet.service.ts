import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pet } from './pet';

@Injectable({
  providedIn: 'root'
})
export class PetService {

  private baseUrl = "http://localhost:8080/api/v1/pets";

  constructor(private httpClient : HttpClient) { }

  getAllPets() : Observable<Pet[]>{
    return this.httpClient.get<Pet[]>(`${this.baseUrl}`);
  }
}
