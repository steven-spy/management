import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {MainRoutingModule} from './main-routing.module';
import {UserService} from "../Service/user.service";
import {NgZorroAntdModule, NzButtonModule} from "ng-zorro-antd";
import {BicycleTrackService} from "../Service/bicycleTrack.service";
import {BicycleInformationComponent} from "./bicycle-information/bicycle-information.component";
import {FormsModule} from "@angular/forms";
import {BicycleInformationService} from "../Service/bicycleInformation.service";


@NgModule({
  declarations: [
    BicycleInformationComponent
  ],
  providers: [UserService, BicycleTrackService, BicycleInformationService],
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
