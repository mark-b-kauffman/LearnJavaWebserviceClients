
/**
 * UserWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

    package com.blackboard.bbdn.bbws.generated;

    /**
     *  UserWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UserWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UserWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UserWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for initializeUserWS method
            * override this method for handling normal response from initializeUserWS operation
            */
           public void receiveResultinitializeUserWS(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.InitializeUserWSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeUserWS operation
           */
            public void receiveErrorinitializeUserWS(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeUserDataSourceId method
            * override this method for handling normal response from changeUserDataSourceId operation
            */
           public void receiveResultchangeUserDataSourceId(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.ChangeUserDataSourceIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeUserDataSourceId operation
           */
            public void receiveErrorchangeUserDataSourceId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveUser method
            * override this method for handling normal response from saveUser operation
            */
           public void receiveResultsaveUser(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.SaveUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveUser operation
           */
            public void receiveErrorsaveUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSystemRoles method
            * override this method for handling normal response from getSystemRoles operation
            */
           public void receiveResultgetSystemRoles(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.GetSystemRolesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSystemRoles operation
           */
            public void receiveErrorgetSystemRoles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteAddressBookEntry method
            * override this method for handling normal response from deleteAddressBookEntry operation
            */
           public void receiveResultdeleteAddressBookEntry(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.DeleteAddressBookEntryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteAddressBookEntry operation
           */
            public void receiveErrordeleteAddressBookEntry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeUserBatchUid method
            * override this method for handling normal response from changeUserBatchUid operation
            */
           public void receiveResultchangeUserBatchUid(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.ChangeUserBatchUidResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeUserBatchUid operation
           */
            public void receiveErrorchangeUserBatchUid(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserInstitutionRoles method
            * override this method for handling normal response from getUserInstitutionRoles operation
            */
           public void receiveResultgetUserInstitutionRoles(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.GetUserInstitutionRolesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserInstitutionRoles operation
           */
            public void receiveErrorgetUserInstitutionRoles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAddressBookEntry method
            * override this method for handling normal response from getAddressBookEntry operation
            */
           public void receiveResultgetAddressBookEntry(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.GetAddressBookEntryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAddressBookEntry operation
           */
            public void receiveErrorgetAddressBookEntry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteUser method
            * override this method for handling normal response from deleteUser operation
            */
           public void receiveResultdeleteUser(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.DeleteUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteUser operation
           */
            public void receiveErrordeleteUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getObservee method
            * override this method for handling normal response from getObservee operation
            */
           public void receiveResultgetObservee(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.GetObserveeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getObservee operation
           */
            public void receiveErrorgetObservee(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteUserByInstitutionRole method
            * override this method for handling normal response from deleteUserByInstitutionRole operation
            */
           public void receiveResultdeleteUserByInstitutionRole(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.DeleteUserByInstitutionRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteUserByInstitutionRole operation
           */
            public void receiveErrordeleteUserByInstitutionRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveAddressBookEntry method
            * override this method for handling normal response from saveAddressBookEntry operation
            */
           public void receiveResultsaveAddressBookEntry(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.SaveAddressBookEntryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveAddressBookEntry operation
           */
            public void receiveErrorsaveAddressBookEntry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteObserverAssociation method
            * override this method for handling normal response from deleteObserverAssociation operation
            */
           public void receiveResultdeleteObserverAssociation(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.DeleteObserverAssociationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteObserverAssociation operation
           */
            public void receiveErrordeleteObserverAssociation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveObserverAssociation method
            * override this method for handling normal response from saveObserverAssociation operation
            */
           public void receiveResultsaveObserverAssociation(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.SaveObserverAssociationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveObserverAssociation operation
           */
            public void receiveErrorsaveObserverAssociation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getInstitutionRoles method
            * override this method for handling normal response from getInstitutionRoles operation
            */
           public void receiveResultgetInstitutionRoles(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.GetInstitutionRolesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getInstitutionRoles operation
           */
            public void receiveErrorgetInstitutionRoles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUser method
            * override this method for handling normal response from getUser operation
            */
           public void receiveResultgetUser(
                    com.blackboard.bbdn.bbws.generated.UserWSStub.GetUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUser operation
           */
            public void receiveErrorgetUser(java.lang.Exception e) {
            }
                


    }
    