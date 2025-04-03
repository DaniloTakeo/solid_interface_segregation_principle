package case3.problem;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendEmail(String message) {
        System.out.println("Enviando e-mail: " + message);
    }

    @Override
    public void sendSMS(String message) {
        throw new UnsupportedOperationException("Não suporta envio de SMS.");
    }

    @Override
    public void sendPushNotification(String message) {
        throw new UnsupportedOperationException("Não suporta envio de notificações push.");
    }
}
