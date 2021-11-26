import { Component, OnInit } from '@angular/core';
import { Pet } from '../pet';

@Component({
  selector: 'app-pet-list',
  templateUrl: './pet-list.component.html',
  styleUrls: ['./pet-list.component.css']
})
export class PetListComponent implements OnInit {

  pets!: Pet[];

  constructor() { }

  ngOnInit(): void {
    this.pets = [{
      "id" : 1,
      "nome" : "Mingau",
      "nomeDono" : "Victor Lobato",
      "emailDono" : "victor@gmail.com"
    },{
      "id" : 2,
      "nome" : "Lambe-lambe",
      "nomeDono" : "Victor Lobato",
      "emailDono" : "victor@gmail.com"
    }];
  }

}
