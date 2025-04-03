package case3.problem;

public interface NotificationSender {
    void sendEmail(String message);
    void sendSMS(String message);
    void sendPushNotification(String message);
}