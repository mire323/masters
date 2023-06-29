import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Veterinarian } from '../state/veterinarian.model';
import { VeterinarianService } from '../state/veterinarian.service';

@Component({
  selector: 'app-vet-form',
  templateUrl: './vet-form.component.html',
  styleUrls: ['./vet-form.component.scss']
})
export class VetFormComponent implements OnInit {
  veterinarian: Veterinarian = {
    id: 0,
    firstName: '',
    lastName: '',
    specialization: '',
    phoneNumber: ''
  };

  constructor(private veterinarianService: VeterinarianService, private toastr: ToastrService, private router: Router) { }

  ngOnInit(): void {
  }

  async onSubmit(form: NgForm) {
    if (form.valid) {
      this.veterinarianService.createVeterinarian(this.veterinarian).subscribe(
        (response) => {
          this.toastr.success('Veterinarian created successfully!');
          form.reset();
        },
        (error) => {
          this.toastr.error('Error creating veterinarian:', error);
        }
      );
    }
  }
  async onSubmitAndClose(form: NgForm){
    await this.onSubmit(form);
    this.router.navigate(['/vets-table']);
  }
  
}
