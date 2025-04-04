package case4.problem;

public class LegacySystemAuthenticator implements Authenticator {
    @Override
    public void authenticateWithPassword(String username, String password) {
        System.out.println("Autenticando com usuário e senha.");
    }

    @Override
    public void authenticateWithFingerprint(byte[] fingerprintData) {
        throw new UnsupportedOperationException("Não suporta autenticação por digital.");
    }

    @Override
    public void authenticateWithFace(byte[] faceScan) {
        throw new UnsupportedOperationException("Não suporta autenticação facial.");
    }

    @Override
    public void authenticateWithToken(String token) {
        throw new UnsupportedOperationException("Não suporta autenticação por token.");
    }
}