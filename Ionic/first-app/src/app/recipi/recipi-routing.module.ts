import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RecipiPage } from './recipi.page';

const routes: Routes = [
  {
    path: '',
    component: RecipiPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class RecipiPageRoutingModule {}
