import { Component, OnInit } from '@angular/core';
import { RecipiService } from '../service/recipi.service';
import { LoadingController } from '@ionic/angular';
import { recipi } from '../model/recipi.model';

@Component({
  selector: 'app-recipi',
  templateUrl: './recipi.page.html',
  styleUrls: ['./recipi.page.scss'],
})
export class RecipiPage implements OnInit {
 recipi:recipi[]=[];
  constructor( protected service :RecipiService) { }
  
  ngOnInit() {
    this.recipi=this.service.getAllRecipi();
    console.log(this.recipi)

  }

}
