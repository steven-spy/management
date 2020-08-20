import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MainComponent} from "./main.component";
import {BicycleInformationComponent} from "./bicycle-information/bicycle-information.component";
import {BicycleRepairComponent} from "./bicycle-repair/bicycle-repair.component";


const routes: Routes = [
  {
    path: '',
    component: MainComponent,
    children: [
      {
        path: 'bicycleInformation',
        component: BicycleInformationComponent
      },
      {
        path: 'bicycleRepair',
        component: BicycleRepairComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MainRoutingModule {
}
