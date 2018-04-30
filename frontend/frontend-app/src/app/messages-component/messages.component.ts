import { Component, OnInit } from '@angular/core';

import { MessagesService } from '../messages.service';
import { Message } from '../message.model';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ['./messages.component.css']
})
export class MessagesComponent implements OnInit {
  messages: Message[];

  constructor(private messagesService: MessagesService) { }

  ngOnInit() {
    this.messagesService.getAll()
      .subscribe((res) => this.messages = res);
  }

}
