import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

import { Message } from './message.model';

@Injectable()
export class MessagesService {

  constructor(private http:HttpClient) { }

  public getAll(): Observable<Message[]> {
    return this.http.get('/api/messages')
    .map((res: any) => {
      return res.messages.map(item => {
        return new Message(item.content, item.timestamp, item.sender);
      });
    });
  }

  // TODO: Remove static stub
  public getAllStub(): Observable<Message[]> {
    return Observable.of([
      { content: 'Test 1', timestamp: new Date('2011-01-01'), sender: 'someone' },
      { content: 'Test 2', timestamp: new Date('2012-01-01'), sender: 'someone else' }
    ]);
  }
}
