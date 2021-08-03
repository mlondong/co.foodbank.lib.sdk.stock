package co.com.foodbank.stock.sdk.model;

import java.io.Serializable;
import java.util.Date;
import co.com.foodbank.contribution.dao.ContributionData;
import co.com.foodbank.product.dto.ProductData;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.sdk.model 27/07/2021
 */
public class ResponseStockData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String id;
    private ContributionData contribution;
    private ProductData product;
    private Date dateStock;
    private Long quantity;


    /**
     * Default constructor.
     */
    public ResponseStockData() {}


    public ProductData getProduct() {
        return product;
    }

    public void setProduct(ProductData product) {
        this.product = product;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public ContributionData getContribution() {
        return contribution;
    }


    public void setContribution(ContributionData contribution) {
        this.contribution = contribution;
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
