import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { MainComponent } from './main/main.component';
import {MainModule} from "./main/main.module";

@NgModule({
  declarations: [
  AppComponent,
  MainComponent,
],
imports: [
  BrowserModule,
  AppRoutingModule,
  HttpClientModule,
  MainModule
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
