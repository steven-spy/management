import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {MainRoutingModule} from './main-routing.module';
import {UserService} from "../Service/user.service";
import {NgZorroAntdModule, NzButtonModule} from "ng-zorro-antd";
import {BicycleTrackService} from "../Service/bicycleTrack.service";


@NgModule({
  declarations: [],
  providers: [UserService, BicycleTrackService],
  imports: [
    CommonModule,
    MainRoutingModule,
    NzButtonModule,
    NgZorroAntdModule,
  ]
})
export class MainModule {
}
