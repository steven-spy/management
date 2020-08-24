import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {MainRoutingModule} from './main-routing.module';
import {UserService} from "../Service/user.service";
import {NgZorroAntdModule, NzButtonModule} from "ng-zorro-antd";
import {BicycleTrackService} from "../Service/bicycleTrack.service";
import {BicycleInformationComponent} from "./bicycle-information/bicycle-information.component";
import {FormsModule} from "@angular/forms";
import {BicycleInformationService} from "../Service/bicycleInformation.service";
import {BicycleRepairComponent} from './bicycle-repair/bicycle-repair.component';
import {LeasePointComponent} from './lease-point/lease-point.component';
import {LeasePointService} from "../Service/lease-point.service";


@NgModule({
  declarations: [
    BicycleInformationComponent,
    BicycleRepairComponent,
    LeasePointComponent
  ],
  providers: [UserService, BicycleTrackService, BicycleInformationService, LeasePointService],
  imports: [
    CommonModule,
    MainRoutingModule,
    NzButtonModule,
    NgZorroAntdModule,
    FormsModule,
  ]
})
export class MainModule {
}
