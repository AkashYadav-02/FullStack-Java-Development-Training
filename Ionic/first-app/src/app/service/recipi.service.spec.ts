import { TestBed } from '@angular/core/testing';

import { RecipiService } from './recipi.service';

describe('RecipiService', () => {
  let service: RecipiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RecipiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
