package co.com.foodbank.stock.sdk.util;

/**
 * @author mauricio.londono@gmail.com
 * co.com.foodbank.stock.sdk.util
 * 25/08/2021
 */
public final class SDKStockParameters {

    public static final String _PREFIX = "/stock";
    public static final String _SUFIX_FIND_CONTB_STOCK = "/findContributionById/id/";
    public static final String _SUFIX_FIND_PROD_STOCK= "/findProductById/id/";
    public static final String _SUFIX_UPDATE_STOCK= "/update/id-stock/";
    public static final String _SUFIX_FIND_STOCK_ID= "/findById/";


    public static final String PATH_FIND_CONT_STOCK = _PREFIX + _SUFIX_FIND_CONTB_STOCK;
    public static final String PATH_FIND_PROD_STOCK = _PREFIX + _SUFIX_FIND_PROD_STOCK;
    public static final String PATH_UPDATE_STOCK = _PREFIX + _SUFIX_UPDATE_STOCK;
    public static final String PATH_FIND_STOCK_ID = _PREFIX + _SUFIX_FIND_STOCK_ID;


    public SDKStockParameters() {}
}
