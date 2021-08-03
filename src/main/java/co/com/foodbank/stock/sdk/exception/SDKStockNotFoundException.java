package co.com.foodbank.stock.sdk.exception;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.sdk.exception
 *         27/07/2021
 */
public class SDKStockNotFoundException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;

    public SDKStockNotFoundException(String id, String message) {
        super(id + " " + message);
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }



}
