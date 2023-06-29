import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Veterinarian } from './veterinarian.model';

@Injectable({
  providedIn: 'root'
})
export class VeterinarianService {
  private apiUrl = '/api/veterinarians';

  constructor(private http: HttpClient) { }

  createVeterinarian(veterinarian: Veterinarian): Observable<Veterinarian> {
    return this.http.post<Veterinarian>(this.apiUrl, veterinarian);
  }

  getVeterinarians(): Observable<Veterinarian[]> {
    return this.http.get<Veterinarian[]>(`${this.apiUrl}`);
  }
}
