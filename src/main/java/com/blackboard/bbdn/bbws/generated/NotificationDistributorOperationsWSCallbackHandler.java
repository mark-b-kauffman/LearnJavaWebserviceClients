/**
 * NotificationDistributorOperationsWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.blackboard.bbdn.bbws.generated;


/**
 *  NotificationDistributorOperationsWSCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class NotificationDistributorOperationsWSCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public NotificationDistributorOperationsWSCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public NotificationDistributorOperationsWSCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for setDistributorAvailabilityForUser method
     * override this method for handling normal response from setDistributorAvailabilityForUser operation
     */
    public void receiveResultsetDistributorAvailabilityForUser(
        com.blackboard.bbdn.bbws.generated.NotificationDistributorOperationsWSStub.SetDistributorAvailabilityForUserResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setDistributorAvailabilityForUser operation
     */
    public void receiveErrorsetDistributorAvailabilityForUser(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for initializeNotificationDistributorOperationsWS method
     * override this method for handling normal response from initializeNotificationDistributorOperationsWS operation
     */
    public void receiveResultinitializeNotificationDistributorOperationsWS(
        com.blackboard.bbdn.bbws.generated.NotificationDistributorOperationsWSStub.InitializeNotificationDistributorOperationsWSResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from initializeNotificationDistributorOperationsWS operation
     */
    public void receiveErrorinitializeNotificationDistributorOperationsWS(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getServerVersion method
     * override this method for handling normal response from getServerVersion operation
     */
    public void receiveResultgetServerVersion(
        com.blackboard.bbdn.bbws.generated.NotificationDistributorOperationsWSStub.GetServerVersionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getServerVersion operation
     */
    public void receiveErrorgetServerVersion(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerDistributorResults method
     * override this method for handling normal response from registerDistributorResults operation
     */
    public void receiveResultregisterDistributorResults(
        com.blackboard.bbdn.bbws.generated.NotificationDistributorOperationsWSStub.RegisterDistributorResultsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerDistributorResults operation
     */
    public void receiveErrorregisterDistributorResults(java.lang.Exception e) {
    }
}
