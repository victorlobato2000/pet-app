import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PetListComponent } from './pet-list/pet-list.component';

const routes: Routes = [
  { path: 'pets', component: PetListComponent },
  { path: '', redirectTo: 'pets', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
