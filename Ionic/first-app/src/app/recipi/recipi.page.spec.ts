import { ComponentFixture, TestBed, async } from '@angular/core/testing';
import { RecipiPage } from './recipi.page';

describe('RecipiPage', () => {
  let component: RecipiPage;
  let fixture: ComponentFixture<RecipiPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(RecipiPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
