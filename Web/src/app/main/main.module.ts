import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MainRoutingModule } from './main-routing.module';
import { MapComponent } from './map/map.component';
import {UserService} from "../Service/user.service";


@NgModule({
  declarations: [MapComponent],
  providers: [UserService],
  imports: [
    CommonModule,
    MainRoutingModule
  ]
})
export class MainModule { }
