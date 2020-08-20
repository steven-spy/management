import {Component, OnInit} from '@angular/core';
import {BicycleInformationService} from "../../Service/bicycleInformation.service";
import {NzMessageService} from "ng-zorro-antd";

@Component({
  selector: 'app-bicycle-repair',
  templateUrl: './bicycle-repair.component.html',
  styleUrls: ['./bicycle-repair.component.scss']
})
export class BicycleRepairComponent implements OnInit {
  listOfDisplayData: any;
  pageSize: number = 6;
  loading: boolean = true;
  total: any;
  current: number = 1;
  biName: string;

  constructor(
    private bicycleInformationService: BicycleInformationService,
    private message: NzMessageService
  ) {
  }

  ngOnInit(): void {
    this.getBicycleWithCondition();
  }

  getBicycleWithCondition() {
    this.bicycleInformationService.getAllWithCondition().subscribe(res => {
      console.info(res);
      this.listOfDisplayData = res;
      this.loading = false;
    })
  }

  changePageIndex(data: any) {
    this.bicycleInformationService.getAllWithCondition().subscribe(res => {
      this.listOfDisplayData = res;
    })
  }

  click(data: any) {
    this.biName = data.biName;
  }


  repairConfirm(data: any) {
    console.info(data);
    this.bicycleInformationService.repairBicycle(data.biId).subscribe(res => {
      this.message.create(
        'success',
        this.biName + '自行车维修成功！'
      )
      this.getBicycleWithCondition();
    }, error => {
      this.message.create(
        'error',
        this.biName + '自行车维修失败！'
      )
    });
  }

  deleteConfirm(data: any) {
    console.info(data);
  }
}
