import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { RecipiPageRoutingModule } from './recipi-routing.module';

import { RecipiPage } from './recipi.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RecipiPageRoutingModule
  ],
  declarations: [RecipiPage]
})
export class RecipiPageModule {}
