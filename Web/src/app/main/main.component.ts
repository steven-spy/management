import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-main',
  template: `
      <!--    <p>-->
      <!--        main works!-->
      <!--    </p>-->
      <!--    <p>-->
      <!--        main works!-->
      <!--    </p>-->
      <!--&lt;!&ndash;    <button (click)="map()">map</button>&ndash;&gt;-->
      <router-outlet></router-outlet>
  `,
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit {

  constructor(
    private router: Router,
  ) {
  }

  ngOnInit(): void {
  }

  map() {
    this.router.navigate(['/main/map']);
  }
}
