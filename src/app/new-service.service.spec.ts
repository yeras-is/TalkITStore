import { TestBed } from '@angular/core/testing';

import { NewServiceService } from './new-service.service';

describe('NewServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: NewServiceService = TestBed.get(NewServiceService);
    expect(service).toBeTruthy();
  });
});
