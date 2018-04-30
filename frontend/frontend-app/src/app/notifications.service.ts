import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

import { Notification } from './notification.model';

@Injectable()
export class NotificationsService {

  constructor(private http:HttpClient) { }

  public getAll(): Observable<Notification[]> {
    return this.http.get('/api/notifications')
      .map((res: any) => {
        return res.notifications.map(item => {
          return new Notification(item.message, item.timestamp, item.severity);
        });
      });
  }

  // TODO: Remove static stub
  public getAllStub(): Observable<Notification[]> {
    return Observable.of([
      { message: 'Test 1', timestamp: new Date('2011-01-01'), severity: 'Critical' },
      { message: 'Test 2', timestamp: new Date('2012-01-01'), severity: 'High' }
    ]);
  }
}
