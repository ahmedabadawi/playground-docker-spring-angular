export class Notification {
  message: string;
  timestamp: Date;
  severity: string;

  constructor(message: string, timestamp: Date, severity: string) {
    this.message = message;
    this.timestamp = timestamp;
    this.severity = severity;
  }
}
