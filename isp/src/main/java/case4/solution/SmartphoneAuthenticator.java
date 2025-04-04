package case4.solution;

public class SmartphoneAuthenticator implements FingerprintAuthenticator, FaceAuthenticator {
    @Override
    public void authenticateWithFingerprint(byte[] fingerprintData) {
        System.out.println("Autenticando com digital.");
    }

    @Override
    public void authenticateWithFace(byte[] faceScan) {
        System.out.println("Autenticando com reconhecimento facial.");
    }
}
