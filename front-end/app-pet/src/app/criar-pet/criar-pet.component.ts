import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pet } from '../pet';
import { PetService } from '../pet.service';

@Component({
  selector: 'app-criar-pet',
  templateUrl: './criar-pet.component.html',
  styleUrls: ['./criar-pet.component.css']
})
export class CriarPetComponent implements OnInit {

  pet : Pet = new Pet();

  constructor(private petService : PetService, private router : Router) { }

  ngOnInit(): void {
  }

  savePet(){
    this.petService.createPet(this.pet).subscribe(data =>{
      console.log(data);
      this.goToPetList();
    },
    error => console.log(error));
  }

  goToPetList(){
    this.router.navigate(['/pets']);
  }
  onSubmit(){
    this.savePet();
  }

}
