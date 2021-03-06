import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {MainRoutingModule} from './main-routing.module';
import {UserService} from "../Service/user.service";
import {NgZorroAntdModule, NzButtonModule} from "ng-zorro-antd";
import {BicycleTrackService} from "../Service/bicycleTrack.service";
import {BicycleInformationComponent} from "./bicycle-information/bicycle-information.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BicycleInformationService} from "../Service/bicycleInformation.service";
import {BicycleRepairComponent} from './bicycle-repair/bicycle-repair.component';
import {LeasePointComponent} from './lease-point/lease-point.component';
import {LeasePointService} from "../Service/lease-point.service";
import {BicycleInformationModelComponent} from './bicycle-information/bicycle-information-model/bicycle-information-model.component';


@NgModule({
  declarations: [
    BicycleInformationComponent,
    BicycleRepairComponent,
    LeasePointComponent,
    BicycleInformationModelComponent,

  ],
  providers: [UserService, BicycleTrackService, BicycleInformationService, LeasePointService],
  imports: [
    CommonModule,
    MainRoutingModule,
    NzButtonModule,
    NgZorroAntdModule,
    FormsModule,
    ReactiveFormsModule,
  ]
})
export class MainModule {
}
