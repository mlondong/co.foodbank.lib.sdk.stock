package co.com.foodbank.stock.sdk.exception;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.sdk.exception
 *         27/07/2021
 */
public class SDKStockServiceIllegalArgumentException extends Exception {
    private static final long serialVersionUID = 1L;

    public SDKStockServiceIllegalArgumentException(Exception e) {
        super(e);
    }
}
