package payment;

import java.util.Base64;

public class SecurityUtils {
    public static String tokenize(String sensitiveData) {
        return Base64.getEncoder().encodeToString(sensitiveData.getBytes());
    }

    public static String detokenize(String token) {
        return new String(Base64.getDecoder().decode(token));
    }
}
