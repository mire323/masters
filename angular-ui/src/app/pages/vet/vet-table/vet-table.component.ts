import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VeterinarianService } from '../state/veterinarian.service';

@Component({
  selector: 'app-vet-table',
  templateUrl: './vet-table.component.html',
  styleUrls: ['./vet-table.component.scss']
})
export class VetTableComponent implements OnInit {

  veterinarians$ = this.vetService.getVeterinarians();

  
  constructor(private vetService: VeterinarianService, private router: Router) { }

  ngOnInit() {
  }
  navigateToForm() {
    this.router.navigate(['/vets-form']);
  }
}
