import { Component, OnInit } from '@angular/core';
import {UserService} from "../../Service/user.service";

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.scss']
})
export class MapComponent implements OnInit {

  listData: any;

  constructor(
    private userService: UserService
  ) { }

  ngOnInit() {
    this.getAllUser();
  }

  getAllUser() {
    this.userService.getUser().subscribe(res => {
      this.listData = res;
    })
  }
}
