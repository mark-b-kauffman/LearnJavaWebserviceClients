/**
 * AnnouncementWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.blackboard.bbdn.bbws.generated;


/**
 *  AnnouncementWSCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class AnnouncementWSCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public AnnouncementWSCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public AnnouncementWSCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for createCourseAnnouncements method
     * override this method for handling normal response from createCourseAnnouncements operation
     */
    public void receiveResultcreateCourseAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.CreateCourseAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createCourseAnnouncements operation
     */
    public void receiveErrorcreateCourseAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteOrgAnnouncements method
     * override this method for handling normal response from deleteOrgAnnouncements operation
     */
    public void receiveResultdeleteOrgAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.DeleteOrgAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteOrgAnnouncements operation
     */
    public void receiveErrordeleteOrgAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for initializeAnnouncementWS method
     * override this method for handling normal response from initializeAnnouncementWS operation
     */
    public void receiveResultinitializeAnnouncementWS(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.InitializeAnnouncementWSResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from initializeAnnouncementWS operation
     */
    public void receiveErrorinitializeAnnouncementWS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteSystemAnnouncements method
     * override this method for handling normal response from deleteSystemAnnouncements operation
     */
    public void receiveResultdeleteSystemAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.DeleteSystemAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteSystemAnnouncements operation
     */
    public void receiveErrordeleteSystemAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCourseAnnouncements method
     * override this method for handling normal response from getCourseAnnouncements operation
     */
    public void receiveResultgetCourseAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.GetCourseAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCourseAnnouncements operation
     */
    public void receiveErrorgetCourseAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateCourseAnnouncements method
     * override this method for handling normal response from updateCourseAnnouncements operation
     */
    public void receiveResultupdateCourseAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.UpdateCourseAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateCourseAnnouncements operation
     */
    public void receiveErrorupdateCourseAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createOrgAnnouncements method
     * override this method for handling normal response from createOrgAnnouncements operation
     */
    public void receiveResultcreateOrgAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.CreateOrgAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createOrgAnnouncements operation
     */
    public void receiveErrorcreateOrgAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateOrgAnnouncements method
     * override this method for handling normal response from updateOrgAnnouncements operation
     */
    public void receiveResultupdateOrgAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.UpdateOrgAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateOrgAnnouncements operation
     */
    public void receiveErrorupdateOrgAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createSystemAnnouncements method
     * override this method for handling normal response from createSystemAnnouncements operation
     */
    public void receiveResultcreateSystemAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.CreateSystemAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createSystemAnnouncements operation
     */
    public void receiveErrorcreateSystemAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSystemAnnouncements method
     * override this method for handling normal response from getSystemAnnouncements operation
     */
    public void receiveResultgetSystemAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.GetSystemAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSystemAnnouncements operation
     */
    public void receiveErrorgetSystemAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getServerVersion method
     * override this method for handling normal response from getServerVersion operation
     */
    public void receiveResultgetServerVersion(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.GetServerVersionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getServerVersion operation
     */
    public void receiveErrorgetServerVersion(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrgAnnouncements method
     * override this method for handling normal response from getOrgAnnouncements operation
     */
    public void receiveResultgetOrgAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.GetOrgAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrgAnnouncements operation
     */
    public void receiveErrorgetOrgAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateSystemAnnouncements method
     * override this method for handling normal response from updateSystemAnnouncements operation
     */
    public void receiveResultupdateSystemAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.UpdateSystemAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateSystemAnnouncements operation
     */
    public void receiveErrorupdateSystemAnnouncements(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteCourseAnnouncements method
     * override this method for handling normal response from deleteCourseAnnouncements operation
     */
    public void receiveResultdeleteCourseAnnouncements(
        com.blackboard.bbdn.bbws.generated.AnnouncementWSStub.DeleteCourseAnnouncementsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteCourseAnnouncements operation
     */
    public void receiveErrordeleteCourseAnnouncements(java.lang.Exception e) {
    }
}
