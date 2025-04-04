package case4.problem;

public interface Authenticator {
    void authenticateWithPassword(String username, String password);
    void authenticateWithFingerprint(byte[] fingerprintData);
    void authenticateWithFace(byte[] faceScan);
    void authenticateWithToken(String token);
}
