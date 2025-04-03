package case3.solution;

public class EmailNotificationSender implements EmailSender {
    @Override
    public void sendEmail(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}