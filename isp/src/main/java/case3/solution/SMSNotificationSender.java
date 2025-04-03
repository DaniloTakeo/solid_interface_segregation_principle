package case3.solution;

public class SMSNotificationSender implements SMSSender {
    @Override
    public void sendSMS(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
