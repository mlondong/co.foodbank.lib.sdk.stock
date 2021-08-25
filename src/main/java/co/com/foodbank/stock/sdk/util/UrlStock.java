package co.com.foodbank.stock.sdk.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Class to handle Url for sdk vault.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.util 25/08/2021
 */
@Component
@Validated
public class UrlStock {

    @Value("${sdk.service.stock.scheme}")
    private String urlScheme;

    @Value("${sdk.service.stock.url}")
    private String urlBase;


    public String tofindContbStock(String idContribution) {
        return UriComponentsBuilder.newInstance().scheme(urlScheme)
                .host(urlBase)
                .path(SDKStockParameters.PATH_FIND_CONT_STOCK + idContribution)
                .buildAndExpand(encode(idContribution)).toString();
    }

    public String toFindProductStock(String idProduct) {
        return UriComponentsBuilder.newInstance().scheme(urlScheme)
                .host(urlBase)
                .path(SDKStockParameters.PATH_FIND_PROD_STOCK + idProduct)
                .buildAndExpand(encode(idProduct)).toString();
    }


    public String toUpdateStock(String idStock) {
        return UriComponentsBuilder.newInstance().scheme(urlScheme)
                .host(urlBase)
                .path(SDKStockParameters.PATH_UPDATE_STOCK + idStock)
                .buildAndExpand(encode(idStock)).toString();
    }


    public String toFindStockById(String idStock) {
        return UriComponentsBuilder.newInstance().scheme(urlScheme)
                .host(urlBase)
                .path(SDKStockParameters.PATH_FIND_STOCK_ID + idStock)
                .buildAndExpand(encode(idStock)).toString();
    }



    /**
     * Method for encode
     * 
     * @param value url
     * @return utf8 encoded url
     */
    private String encode(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

}
