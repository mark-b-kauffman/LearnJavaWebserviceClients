
/**
 * UtilWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

    package com.blackboard.bbdn.bbws.generated;

    /**
     *  UtilWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UtilWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UtilWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UtilWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadSetting method
            * override this method for handling normal response from loadSetting operation
            */
           public void receiveResultloadSetting(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.LoadSettingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadSetting operation
           */
            public void receiveErrorloadSetting(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDataSources method
            * override this method for handling normal response from getDataSources operation
            */
           public void receiveResultgetDataSources(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.GetDataSourcesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDataSources operation
           */
            public void receiveErrorgetDataSources(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteSetting method
            * override this method for handling normal response from deleteSetting operation
            */
           public void receiveResultdeleteSetting(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.DeleteSettingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteSetting operation
           */
            public void receiveErrordeleteSetting(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRequiredEntitlements method
            * override this method for handling normal response from getRequiredEntitlements operation
            */
           public void receiveResultgetRequiredEntitlements(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.GetRequiredEntitlementsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRequiredEntitlements operation
           */
            public void receiveErrorgetRequiredEntitlements(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkEntitlement method
            * override this method for handling normal response from checkEntitlement operation
            */
           public void receiveResultcheckEntitlement(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.CheckEntitlementResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkEntitlement operation
           */
            public void receiveErrorcheckEntitlement(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveSetting method
            * override this method for handling normal response from saveSetting operation
            */
           public void receiveResultsaveSetting(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.SaveSettingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveSetting operation
           */
            public void receiveErrorsaveSetting(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initializeUtilWS method
            * override this method for handling normal response from initializeUtilWS operation
            */
           public void receiveResultinitializeUtilWS(
                    com.blackboard.bbdn.bbws.generated.UtilWSStub.InitializeUtilWSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeUtilWS operation
           */
            public void receiveErrorinitializeUtilWS(java.lang.Exception e) {
            }
                


    }
    