import { Injectable } from '@angular/core';
import { recipi } from '../model/recipi.model';

@Injectable({
  providedIn: 'root'
})
export class RecipiService {
  constructor() { }

  recipiList: recipi[] = [
    {
      id: "101",
      title: "wada pav",
      imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Vada_Pav-Indian_street_food.JPG/250px-Vada_Pav-Indian_street_food.JPG",
      ingredient: [
        "potato",
        "water"
      ]
    },

  ]

  getAllRecipi() {
    return this.recipiList
  }
  addRecipi(recipi: any) {
    this.recipiList.push(recipi)

  }

  getRecipiByid(id: string) {

    return this.recipiList.find((recipi) => {
      return recipi.id === id
    })
  }

  deletecipi(id: string) {
    this.recipiList = this.recipiList.filter((recipi) => recipi.id !== id);

  }





}
