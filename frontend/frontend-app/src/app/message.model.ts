export class Message {
  content: string;
  timestamp: Date;
  sender: string;

  constructor(content: string, timestamp: Date, sender: string) {
    this.content = content;
    this.timestamp = timestamp;
    this.sender = sender;
  }
}
