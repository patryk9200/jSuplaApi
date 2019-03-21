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

package pl.grzeslowski.jsupla.api.generated.api;

import org.junit.Ignore;
import org.junit.Test;
import pl.grzeslowski.jsupla.api.generated.ApiException;
import pl.grzeslowski.jsupla.api.generated.model.Schedule;
import pl.grzeslowski.jsupla.api.generated.model.ScheduleRequest;
import pl.grzeslowski.jsupla.api.generated.model.SchedulesEnableRequest;

import java.util.List;

/**
 * API tests for SchedulesApi
 */
@Ignore
public class SchedulesApiTest {

    private final SchedulesApi api = new SchedulesApi();

    
    /**
     * Create a new schedule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createScheduleTest() throws ApiException {
        ScheduleRequest body = null;
        Schedule response = api.createSchedule(body);

        // TODO: test validations
    }
    
    /**
     * Delete Schedule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteScheduleTest() throws ApiException {
        Integer id = null;
        api.deleteSchedule(id);

        // TODO: test validations
    }
    
    /**
     * Enable schedules
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableSchedulesTest() throws ApiException {
        SchedulesEnableRequest body = null;
        api.enableSchedules(body);

        // TODO: test validations
    }
    
    /**
     * Get Schedule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScheduleTest() throws ApiException {
        Integer id = null;
        List<String> include = null;
        Schedule response = api.getSchedule(id, include);

        // TODO: test validations
    }
    
    /**
     * Get schedules list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchedulesTest() throws ApiException {
        List<String> include = null;
        List<Schedule> response = api.getSchedules(include);

        // TODO: test validations
    }
    
    /**
     * Update schedule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateScheduleTest() throws ApiException {
        Integer id = null;
        ScheduleRequest body = null;
        Boolean enable = null;
        Schedule response = api.updateSchedule(id, body, enable);

        // TODO: test validations
    }
    
}