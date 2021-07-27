package co.com.foodbank.stock.sdk.service;

import java.util.Arrays;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import co.com.foodbank.stock.sdk.exception.SDKStockNotFoundException;
import co.com.foodbank.stock.sdk.exception.SDKStockServiceException;
import co.com.foodbank.stock.sdk.exception.SDKStockServiceIllegalArgumentException;
import co.com.foodbank.stock.sdk.exception.SDKStockServiceNotAvailableException;
import co.com.foodbank.stock.sdk.model.ResponseStockData;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.stock.sdk.service
 *         27/07/2021
 */
@Service
@Validated
public class SDKStockService implements ISDKStockService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    @Autowired
    private ObjectMapper objectMapper;

    @Value("${urlSdkStockfindContrib}")
    private String urlSdkStockfindContrib;



    @Override
    public Collection<ResponseStockData> findStockByContribution(
            String idContribution) throws SDKStockNotFoundException,
            SDKStockServiceException, SDKStockServiceIllegalArgumentException,
            SDKStockServiceNotAvailableException {


        try {

            httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<String> entity = new HttpEntity<String>(httpHeaders);

            String response =
                    restTemplate
                            .exchange(urlSdkStockfindContrib + idContribution,
                                    HttpMethod.GET, entity, String.class)
                            .getBody();

            return objectMapper.readValue(response,
                    new TypeReference<Collection<ResponseStockData>>() {});


        } catch (HttpClientErrorException i) {

            if (i.getStatusCode() == HttpStatus.BAD_REQUEST) {
                throw new SDKStockServiceIllegalArgumentException(i);
            }
            if (i.getStatusCode() == HttpStatus.NOT_FOUND) {
                throw new SDKStockNotFoundException(idContribution,
                        i.getResponseBodyAsString());
            }
            throw new SDKStockServiceException(i);
        } catch (ResourceAccessException i) {
            throw new SDKStockServiceNotAvailableException(i);
        } catch (Exception i) {
            throw new SDKStockServiceException(i);
        }
    }



}
