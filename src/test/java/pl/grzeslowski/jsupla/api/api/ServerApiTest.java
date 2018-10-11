/*
 * SUPLA Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package pl.grzeslowski.jsupla.api.api;

import org.junit.Ignore;
import org.junit.Test;
import pl.grzeslowski.jsupla.api.ApiException;
import pl.grzeslowski.jsupla.api.model.ServerInfo;

/**
 * API tests for ServerApi
 */
@Ignore
public class ServerApiTest {

    private final ServerApi api = new ServerApi();

    
    /**
     * Get server info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServerInfoTest() throws ApiException {
        ServerInfo response = api.getServerInfo();

        // TODO: test validations
    }
    
    /**
     * Get the SUPLA Server status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSuplaServerStatusTest() throws ApiException {
        api.getSuplaServerStatus();

        // TODO: test validations
    }
    
}
