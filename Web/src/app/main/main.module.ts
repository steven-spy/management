import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MainRoutingModule } from './main-routing.module';
import { MapComponent } from './map/map.component';
import {UserService} from "../Service/user.service";
import {NgZorroAntdModule, NzButtonModule} from "ng-zorro-antd";
import {BicycleTrackService} from "../Service/bicycleTrack.service";


@NgModule({
  declarations: [MapComponent],
  providers: [UserService,BicycleTrackService],
  imports: [
    CommonModule,
    MainRoutingModule,
    NzButtonModule,
    NgZorroAntdModule,
  ]
})
export class MainModule { }
