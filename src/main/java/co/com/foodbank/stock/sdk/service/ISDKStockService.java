package co.com.foodbank.stock.sdk.service;

import java.util.Collection;
import co.com.foodbank.stock.dto.StockDTO;
import co.com.foodbank.stock.sdk.exception.SDKStockNotFoundException;
import co.com.foodbank.stock.sdk.exception.SDKStockServiceException;
import co.com.foodbank.stock.sdk.exception.SDKStockServiceIllegalArgumentException;
import co.com.foodbank.stock.sdk.exception.SDKStockServiceNotAvailableException;
import co.com.foodbank.stock.sdk.model.ResponseStockData;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.sdk.service
 *         27/07/2021
 */
public interface ISDKStockService {


    /**
     * Method to find stock by id.
     * 
     * @param idStock
     * @return {@code ResponseStockData}
     * @throws SDKStockNotFoundException
     * @throws SDKStockServiceException
     * @throws SDKStockServiceIllegalArgumentException
     * @throws SDKStockServiceNotAvailableException
     */
    ResponseStockData findStockById(String idStock)
            throws SDKStockNotFoundException, SDKStockServiceException,
            SDKStockServiceIllegalArgumentException,
            SDKStockServiceNotAvailableException;


    /**
     * Method to find Contribution in Stock by id contribution.
     * 
     * @param idContribution
     * @return {@code Collection<ResponseStockData>}
     * @throws SDKStockNotFoundException
     * @throws SDKStockServiceException
     * @throws SDKStockServiceIllegalArgumentException
     * @throws SDKStockServiceNotAvailableException
     */
    Collection<ResponseStockData> findStockByContribution(String idContribution)
            throws SDKStockNotFoundException, SDKStockServiceException,
            SDKStockServiceIllegalArgumentException,
            SDKStockServiceNotAvailableException;


    /**
     * Method to find Contributions in Stock by Product.
     * 
     * @param idProduct
     * @return {@code Collection<ResponseStockData>}
     * @throws SDKStockNotFoundException
     * @throws SDKStockServiceException
     * @throws SDKStockServiceIllegalArgumentException
     * @throws SDKStockServiceNotAvailableException
     */
    Collection<ResponseStockData> findStockByProduct(String idProduct)
            throws SDKStockNotFoundException, SDKStockServiceException,
            SDKStockServiceIllegalArgumentException,
            SDKStockServiceNotAvailableException;


    /**
     * Method to update Stock.
     * 
     * @param _idStock
     * @param dto
     * @return {@code IStock}
     * @throws SDKStockNotFoundException
     * @throws SDKStockServiceException
     * @throws SDKStockServiceIllegalArgumentException
     * @throws SDKStockServiceNotAvailableException
     */
    ResponseStockData updateStock(String _idStock, StockDTO dto)
            throws SDKStockNotFoundException, SDKStockServiceException,
            SDKStockServiceIllegalArgumentException,
            SDKStockServiceNotAvailableException;
}
