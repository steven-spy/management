import {Component, OnInit} from '@angular/core';
import {BicycleInformationService} from "../../Service/bicycleInformation.service";

declare var BMap: any;

@Component({
  selector: 'app-bicycle-information',
  templateUrl: './bicycle-information.component.html',
  styleUrls: ['./bicycle-information.component.scss']
})
export class BicycleInformationComponent implements OnInit {
  inputValue: any;
  listOfDisplayData: any;
  pageSize: number = 6;
  loading: any;
  current: number = 1;
  total: any;
  visible: boolean = false;
  biName: string;
  biPoint: string;
  biState: boolean;
  biJd: string;
  biWd: string;
  state: string;
  text: string;

  constructor(
    private bicycleInformationService: BicycleInformationService
  ) {
  }

  ngOnInit(): void {
    this.getBicycleInformation();
    this.getBicycleCount();
  }

  deleteBicycle(data: any) {

  }

  updateBicycle(data: any) {

  }

  addBicycle() {

  }

  searchBicycle() {
    this.bicycleInformationService.searchBicycleByName(this.inputValue).subscribe(res => {
      console.info(res);
      this.listOfDisplayData = res;
      this.total = this.listOfDisplayData.length;
    });
  }

  getBicycleInformation() {
    this.bicycleInformationService.getAllWithPaging(this.pageSize, 1).subscribe(res => {
      this.listOfDisplayData = res;
    })
  }

  changePageIndex(data: any) {
    this.bicycleInformationService.getAllWithPaging(this.pageSize, data).subscribe(res => {
      this.listOfDisplayData = res;
    })
  }

  getBicycleCount() {
    this.bicycleInformationService.getBicycleCount().subscribe(res => {
      this.total = res;
    })
  }


  open(data: any) {
    console.info(data);
    this.biName = data.biName;
    this.biPoint = data.biPoint;
    this.biState = data.biState;
    this.biJd = data.biJd;
    this.biWd = data.biWd;
    if (this.biState) {
      this.state = 'processing';
      this.text = '运营中';
    } else {
      this.state = 'error';
      this.text = '维修中';
    }
    this.visible = true;
    this.getBicycleLocation();
  }

  close() {
    this.visible = false;
  }

  getBicycleLocation() {
    const map = new BMap.Map('map');//创建地图实例
    const point = new BMap.Point(this.biJd, this.biWd);//创建点坐标
    map.centerAndZoom(point, 15);//初始化地图，设置中心点坐标和地图级别
    const marker = new BMap.Marker(point);  // 创建标注
    map.addOverlay(marker);              // 将标注添加到地图中
    const opts = {
      width: 200,     // 信息窗口宽度
      height: 100,     // 信息窗口高度
      title: this.biName, // 信息窗口标题
      enableMessage: false,//设置不允许信息窗发送短息
    };
    const infoWindow = new BMap.InfoWindow("地址：" + this.biPoint + "<br>" + "当前租赁点内自行车数量：" + this.total, opts);  // 创建信息窗口对象
    marker.addEventListener("click", function () {
      map.openInfoWindow(infoWindow, point); //开启信息窗口
    });
  }

  inputClick() {
    this.inputValue = null;
    this.listOfDisplayData = null;
    this.getBicycleInformation();
    this.getBicycleCount();
  }
}
