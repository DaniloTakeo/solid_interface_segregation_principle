package case3.problem;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void sendEmail(String message) {
        throw new UnsupportedOperationException("Não suporta envio de e-mails.");
    }

    @Override
    public void sendSMS(String message) {
        System.out.println("Enviando SMS: " + message);
    }

    @Override
    public void sendPushNotification(String message) {
        throw new UnsupportedOperationException("Não suporta envio de notificações push.");
    }
}