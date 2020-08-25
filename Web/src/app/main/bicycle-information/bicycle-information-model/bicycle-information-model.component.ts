import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-bicycle-information-model',
  templateUrl: './bicycle-information-model.component.html',
  styleUrls: ['./bicycle-information-model.component.scss']
})
export class BicycleInformationModelComponent implements OnInit {
  validateForm: FormGroup;

  ngOnInit(): void {
  }

  constructor(private fb: FormBuilder) {
    this.validateForm = this.fb.group({
      biName: ['', Validators.required],
      email: ['', Validators.required],
      password: ['', Validators.required],
      confirm: ['', Validators.required],
      comment: ['', Validators.required]
    });
  }

  validateConfirmPassword(): void {
    setTimeout(() => this.validateForm.controls.confirm.updateValueAndValidity());
  }

  submitForm(value) {
    console.log(value);
  }

  resetForm(e) {
    e.preventDefault();
    this.validateForm.reset();
  }

  back() {
    history.back();
  }
}
