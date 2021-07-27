package co.com.foodbank.stock.sdk.exception;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.sdk.exception
 *         27/07/2021
 */
public class SDKStockServiceNotAvailableException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * @param e
     */
    public SDKStockServiceNotAvailableException(Exception e) {
        super(e);
    }
}
