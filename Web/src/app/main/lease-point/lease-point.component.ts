import {Component, OnInit} from '@angular/core';
import {LeasePointService} from "../../Service/lease-point.service";

declare var BMap: any;

@Component({
  selector: 'app-lease-point',
  templateUrl: './lease-point.component.html',
  styleUrls: ['./lease-point.component.scss']
})
export class LeasePointComponent implements OnInit {
  listOfDisplayData: any;
  pageSize: number = 6;
  loading: boolean = false;
  current: number = 1;
  visible: boolean = false;
  lpJd: any;
  lpWd: any;
  lpName: any;
  lpBiNumber: any;
  inputValue: any;

  constructor(
    private leasePointService: LeasePointService
  ) {
  }

  ngOnInit(): void {
    this.getLeasePoint();
  }

  getLeasePoint() {
    this.leasePointService.getLeasePoint().subscribe(res => {
      console.info(res);
      this.listOfDisplayData = res;
    })
  }

  addLeasePoint() {

  }

  open(data: any) {
    console.info(data);
    this.visible = true;
    this.lpName = data.lpName;
    this.lpJd = data.lpJd;
    this.lpWd = data.lpWd;
    this.lpBiNumber = data.lpBinumber;
    this.getLeasePointLocation();
  }

  getLeasePointLocation() {
    const map = new BMap.Map('map');//创建地图实例
    const point = new BMap.Point(this.lpJd, this.lpWd);//创建点坐标
    map.centerAndZoom(point, 15);//初始化地图，设置中心点坐标和地图级别
    const marker = new BMap.Marker(point);  // 创建标注
    map.addOverlay(marker);              // 将标注添加到地图中
    const opts = {
      width: 200,     // 信息窗口宽度
      height: 100,     // 信息窗口高度
      title: "租赁点信息", // 信息窗口标题
      enableMessage: false,//设置不允许信息窗发送短息
    };
    const infoWindow = new BMap.InfoWindow("地址：" + this.lpName + "<br>" + "当前租赁点内自行车数量：" + this.lpBiNumber, opts);  // 创建信息窗口对象
    marker.addEventListener("click", function () {
      map.openInfoWindow(infoWindow, point); //开启信息窗口
    });
  }

  updateLeasePoint(data: any) {

  }

  deleteLeasePoint(data: any) {

  }

  close() {
    this.visible = false;
  }

  inputClick() {

  }

  searchLeasePoint() {

  }
}
