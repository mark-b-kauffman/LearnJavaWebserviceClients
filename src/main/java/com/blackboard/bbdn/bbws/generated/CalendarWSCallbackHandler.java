
/**
 * CalendarWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

    package com.blackboard.bbdn.bbws.generated;

    /**
     *  CalendarWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalendarWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalendarWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalendarWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for canUpdatePersonalCalendarItem method
            * override this method for handling normal response from canUpdatePersonalCalendarItem operation
            */
           public void receiveResultcanUpdatePersonalCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.CanUpdatePersonalCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from canUpdatePersonalCalendarItem operation
           */
            public void receiveErrorcanUpdatePersonalCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for canUpdateCourseCalendarItem method
            * override this method for handling normal response from canUpdateCourseCalendarItem operation
            */
           public void receiveResultcanUpdateCourseCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.CanUpdateCourseCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from canUpdateCourseCalendarItem operation
           */
            public void receiveErrorcanUpdateCourseCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for savePersonalCalendarItem method
            * override this method for handling normal response from savePersonalCalendarItem operation
            */
           public void receiveResultsavePersonalCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.SavePersonalCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from savePersonalCalendarItem operation
           */
            public void receiveErrorsavePersonalCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createCourseCalendarItem method
            * override this method for handling normal response from createCourseCalendarItem operation
            */
           public void receiveResultcreateCourseCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.CreateCourseCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createCourseCalendarItem operation
           */
            public void receiveErrorcreateCourseCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteCourseCalendarItem method
            * override this method for handling normal response from deleteCourseCalendarItem operation
            */
           public void receiveResultdeleteCourseCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.DeleteCourseCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCourseCalendarItem operation
           */
            public void receiveErrordeleteCourseCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updatePersonalCalendarItem method
            * override this method for handling normal response from updatePersonalCalendarItem operation
            */
           public void receiveResultupdatePersonalCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.UpdatePersonalCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updatePersonalCalendarItem operation
           */
            public void receiveErrorupdatePersonalCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteInstitutionCalendarItem method
            * override this method for handling normal response from deleteInstitutionCalendarItem operation
            */
           public void receiveResultdeleteInstitutionCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.DeleteInstitutionCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteInstitutionCalendarItem operation
           */
            public void receiveErrordeleteInstitutionCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateInstitutionCalendarItem method
            * override this method for handling normal response from updateInstitutionCalendarItem operation
            */
           public void receiveResultupdateInstitutionCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.UpdateInstitutionCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateInstitutionCalendarItem operation
           */
            public void receiveErrorupdateInstitutionCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for canUpdateInstitutionCalendarItem method
            * override this method for handling normal response from canUpdateInstitutionCalendarItem operation
            */
           public void receiveResultcanUpdateInstitutionCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.CanUpdateInstitutionCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from canUpdateInstitutionCalendarItem operation
           */
            public void receiveErrorcanUpdateInstitutionCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createInstitutionCalendarItem method
            * override this method for handling normal response from createInstitutionCalendarItem operation
            */
           public void receiveResultcreateInstitutionCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.CreateInstitutionCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createInstitutionCalendarItem operation
           */
            public void receiveErrorcreateInstitutionCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCalendarItem method
            * override this method for handling normal response from getCalendarItem operation
            */
           public void receiveResultgetCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.GetCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCalendarItem operation
           */
            public void receiveErrorgetCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initializeCalendarWS method
            * override this method for handling normal response from initializeCalendarWS operation
            */
           public void receiveResultinitializeCalendarWS(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.InitializeCalendarWSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeCalendarWS operation
           */
            public void receiveErrorinitializeCalendarWS(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveCourseCalendarItem method
            * override this method for handling normal response from saveCourseCalendarItem operation
            */
           public void receiveResultsaveCourseCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.SaveCourseCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveCourseCalendarItem operation
           */
            public void receiveErrorsaveCourseCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateCourseCalendarItem method
            * override this method for handling normal response from updateCourseCalendarItem operation
            */
           public void receiveResultupdateCourseCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.UpdateCourseCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateCourseCalendarItem operation
           */
            public void receiveErrorupdateCourseCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createPersonalCalendarItem method
            * override this method for handling normal response from createPersonalCalendarItem operation
            */
           public void receiveResultcreatePersonalCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.CreatePersonalCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createPersonalCalendarItem operation
           */
            public void receiveErrorcreatePersonalCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveInstitutionCalendarItem method
            * override this method for handling normal response from saveInstitutionCalendarItem operation
            */
           public void receiveResultsaveInstitutionCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.SaveInstitutionCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveInstitutionCalendarItem operation
           */
            public void receiveErrorsaveInstitutionCalendarItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePersonalCalendarItem method
            * override this method for handling normal response from deletePersonalCalendarItem operation
            */
           public void receiveResultdeletePersonalCalendarItem(
                    com.blackboard.bbdn.bbws.generated.CalendarWSStub.DeletePersonalCalendarItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePersonalCalendarItem operation
           */
            public void receiveErrordeletePersonalCalendarItem(java.lang.Exception e) {
            }
                


    }
    