package co.com.foodbank.stock.sdk.model;

import java.util.Date;
import co.com.foodbank.contribution.dto.IContribution;
import co.com.foodbank.product.dto.IProduct;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.sdk.model 27/07/2021
 */
public class ResponseStockData {

    private String id;
    private IContribution contribution;
    private IProduct product;
    private Date dateStock;
    private Long quantity;


    /**
     * Default constructor.
     */
    public ResponseStockData() {}


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public IContribution getContribution() {
        return contribution;
    }


    public void setContribution(IContribution contribution) {
        this.contribution = contribution;
    }


    public IProduct getProduct() {
        return product;
    }


    public void setProduct(IProduct product) {
        this.product = product;
    }


    public Date getDateStock() {
        return dateStock;
    }


    public void setDateStock(Date dateStock) {
        this.dateStock = dateStock;
    }


    public Long getQuantity() {
        return quantity;
    }


    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }



}
