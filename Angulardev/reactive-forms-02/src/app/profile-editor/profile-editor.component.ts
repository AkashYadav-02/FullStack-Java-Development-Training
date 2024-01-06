import { Component } from '@angular/core';
import {  FormBuilder,Validators } from '@angular/forms';

@Component({
  selector: 'app-profile-editor',
  templateUrl: './profile-editor.component.html',
  styleUrls: ['./profile-editor.component.css']
})
export class ProfileEditorComponent {
  
  profileForm = this.fb.group({
    firstName: ['',Validators.required],
    lastName: [''],
    address: this.fb.group({
      street: [''],
      city: [''],
      state: [''],
      zip: ['']
    }),
  });

  constructor(private fb: FormBuilder) { }

  onSubmit() {
    console.log(this.profileForm.value)
  }

  updateForm() {
    this.profileForm.patchValue({
      firstName: 'Akash',
      address:({
        street:'Thane',
        zip:'400706'
      })
    }
    )


    console.log(this.profileForm.status)
    
  }
}
