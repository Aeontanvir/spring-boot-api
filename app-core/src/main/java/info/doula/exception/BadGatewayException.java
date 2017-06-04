package info.doula.exception;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class BadGatewayException extends Exception {

    /**
     * @param message
     */
    public BadGatewayException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public BadGatewayException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public BadGatewayException(String message, Throwable cause) {
        super(message, cause);
    }
}