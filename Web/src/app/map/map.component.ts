import {Component, OnInit} from '@angular/core';
import {UserService} from "../Service/user.service";
import {BicycleTrackService} from "../Service/bicycleTrack.service";

declare var BMap: any;

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.scss']
})
export class MapComponent implements OnInit {

  optionList: any;
  selectedUser: any;
  bicycleListData: any;

  constructor(
    private userService: UserService,
    private bicycleTrackService: BicycleTrackService
  ) {
  }

  ngOnInit() {
    this.getBicycleTrack();
  }

  getBicycleTrack() {
    this.bicycleTrackService.getAll().subscribe(res => {
      this.optionList = res;
    });
  }


  ngAfterViewInit() {
    const map = new BMap.Map('map');//创建地图实例
    const point = new BMap.Point(116.404, 39.915);//创建点坐标
    map.centerAndZoom(point, 15);//初始化地图，设置中心点坐标和地图级别
    map.enableScrollWheelZoom(true);//开启鼠标滚轮缩放
    const marker = new BMap.Marker(point);  // 创建标注
    map.addOverlay(marker);              // 将标注添加到地图中
    const opts = {
      width: 200,     // 信息窗口宽度
      height: 100,     // 信息窗口高度
      title: "海底捞王府井店", // 信息窗口标题
      enableMessage: false,//设置不允许信息窗发送短息
    };
    // const infoWindow = new BMap.InfoWindow("地址：北京市东城区王府井大街88号乐天银泰百货八层", opts);  // 创建信息窗口对象
    // marker.addEventListener("click", function () {
    //   map.openInfoWindow(infoWindow, point); //开启信息窗口
    // });
    map.enableInertialDragging();
    map.enableContinuousZoom();
    var size = new BMap.Size(10, 20);
    map.addControl(new BMap.CityListControl({
      anchor: 'BMAP_ANCHOR_TOP_LEFT',
      offset: size,
      // 切换城市之前事件
      // onChangeBefore: function(){
      //    alert('before');
      // },
      // 切换城市之后事件
      // onChangeAfter:function(){
      //   alert('after');
      // }
    }));
  }

  searchBicycle() {
    console.info(this.selectedUser);
    const map = new BMap.Map('map');
    this.bicycleTrackService.getAppointBicycleTrack(this.selectedUser).subscribe(res => {
      this.bicycleListData = res;
      for (let i = 0; i < this.bicycleListData.length; i++) {
        var myP1 = new BMap.Point(this.bicycleListData[i].btOrJd, this.bicycleListData[i].btOrWd);    //起点
        var myP2 = new BMap.Point(this.bicycleListData[i].btPrJd, this.bicycleListData[i].btPrWd);    //终点
        var driving2 = new BMap.DrivingRoute(map, {renderOptions: {map: map, autoViewport: true}});    //驾车实例
        driving2.search(myP1, myP2);    //显示一条线路
      }
    })
  }
}
