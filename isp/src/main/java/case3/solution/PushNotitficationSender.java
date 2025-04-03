package case3.solution;

class PushNotificationSender implements PushSender {
    @Override
    public void sendPushNotification(String message) {
        System.out.println("Enviando notificação push: " + message);
    }
}