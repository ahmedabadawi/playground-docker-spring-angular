import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MessagesComponent } from './messages-component/messages.component';
import { NotificationsComponent } from './notifications-component/notifications.component';

import { MessagesService } from './messages.service';
import { NotificationsService } from './notifications.service';

@NgModule({
  declarations: [
    AppComponent,
    MessagesComponent,
    NotificationsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ MessagesService, NotificationsService ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
