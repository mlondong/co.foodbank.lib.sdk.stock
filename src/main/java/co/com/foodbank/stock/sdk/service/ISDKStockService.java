package co.com.foodbank.stock.sdk.service;

import java.util.Collection;
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
}
