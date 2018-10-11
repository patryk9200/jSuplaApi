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
import pl.grzeslowski.jsupla.api.model.ChannelExecuteActionRequest;
import pl.grzeslowski.jsupla.api.model.ChannelGroup;
import pl.grzeslowski.jsupla.api.model.ChannelGroupRequest;

import java.util.List;

/**
 * API tests for ChannelGroupsApi
 */
@Ignore
public class ChannelGroupsApiTest {

    private final ChannelGroupsApi api = new ChannelGroupsApi();

    
    /**
     * Create a new channel group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChannelGroupTest() throws ApiException {
        ChannelGroupRequest body = null;
        ChannelGroup response = api.createChannelGroup(body);

        // TODO: test validations
    }
    
    /**
     * Delete Channel Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChannelGroupTest() throws ApiException {
        Integer id = null;
        api.deleteChannelGroup(id);

        // TODO: test validations
    }
    
    /**
     * Execute action on the channel group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeChannelGroupActionTest() throws ApiException {
        Integer id = null;
        ChannelExecuteActionRequest body = null;
        api.executeChannelGroupAction(id, body);

        // TODO: test validations
    }
    
    /**
     * Get channel group by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelGroupTest() throws ApiException {
        Integer id = null;
        List<String> include = null;
        ChannelGroup response = api.getChannelGroup(id, include);

        // TODO: test validations
    }
    
    /**
     * Get channels list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelGroupsTest() throws ApiException {
        List<String> include = null;
        List<ChannelGroup> response = api.getChannelGroups(include);

        // TODO: test validations
    }
    
    /**
     * Update channel group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChannelGroupTest() throws ApiException {
        Integer id = null;
        ChannelGroupRequest body = null;
        ChannelGroup response = api.updateChannelGroup(id, body);

        // TODO: test validations
    }
    
}
