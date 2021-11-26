import { Component, OnInit } from '@angular/core';
import { Pet } from '../pet';
import { PetService } from '../pet.service';

@Component({
  selector: 'app-pet-list',
  templateUrl: './pet-list.component.html',
  styleUrls: ['./pet-list.component.css']
})
export class PetListComponent implements OnInit {

  pets!: Pet[];

  constructor(private petService : PetService) { }

  ngOnInit(): void {
    this.getAllPets();
  }

  private getAllPets(){
    this.petService.getAllPets().subscribe(
      dados => {
        this.pets = dados;
      }
    )
  }
}
