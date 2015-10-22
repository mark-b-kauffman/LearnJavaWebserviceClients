
/**
 * ContentWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

    package com.blackboard.bbdn.bbws.generated;

    /**
     *  ContentWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ContentWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ContentWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ContentWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for deleteCourseTOCs method
            * override this method for handling normal response from deleteCourseTOCs operation
            */
           public void receiveResultdeleteCourseTOCs(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.DeleteCourseTOCsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCourseTOCs operation
           */
            public void receiveErrordeleteCourseTOCs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRequiredEntitlements method
            * override this method for handling normal response from getRequiredEntitlements operation
            */
           public void receiveResultgetRequiredEntitlements(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetRequiredEntitlementsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRequiredEntitlements operation
           */
            public void receiveErrorgetRequiredEntitlements(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateContentFileLinkName method
            * override this method for handling normal response from updateContentFileLinkName operation
            */
           public void receiveResultupdateContentFileLinkName(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.UpdateContentFileLinkNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateContentFileLinkName operation
           */
            public void receiveErrorupdateContentFileLinkName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addContentFile method
            * override this method for handling normal response from addContentFile operation
            */
           public void receiveResultaddContentFile(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.AddContentFileResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addContentFile operation
           */
            public void receiveErroraddContentFile(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteLinks method
            * override this method for handling normal response from deleteLinks operation
            */
           public void receiveResultdeleteLinks(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.DeleteLinksResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteLinks operation
           */
            public void receiveErrordeleteLinks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteContentFiles method
            * override this method for handling normal response from deleteContentFiles operation
            */
           public void receiveResultdeleteContentFiles(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.DeleteContentFilesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteContentFiles operation
           */
            public void receiveErrordeleteContentFiles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteContents method
            * override this method for handling normal response from deleteContents operation
            */
           public void receiveResultdeleteContents(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.DeleteContentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteContents operation
           */
            public void receiveErrordeleteContents(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLinksByReferrerType method
            * override this method for handling normal response from getLinksByReferrerType operation
            */
           public void receiveResultgetLinksByReferrerType(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetLinksByReferrerTypeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinksByReferrerType operation
           */
            public void receiveErrorgetLinksByReferrerType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTOCsByCourseId method
            * override this method for handling normal response from getTOCsByCourseId operation
            */
           public void receiveResultgetTOCsByCourseId(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetTOCsByCourseIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTOCsByCourseId operation
           */
            public void receiveErrorgetTOCsByCourseId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initializeVersion2ContentWS method
            * override this method for handling normal response from initializeVersion2ContentWS operation
            */
           public void receiveResultinitializeVersion2ContentWS(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.InitializeVersion2ContentWSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeVersion2ContentWS operation
           */
            public void receiveErrorinitializeVersion2ContentWS(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFilteredCourseStatus method
            * override this method for handling normal response from getFilteredCourseStatus operation
            */
           public void receiveResultgetFilteredCourseStatus(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetFilteredCourseStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFilteredCourseStatus operation
           */
            public void receiveErrorgetFilteredCourseStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getReviewStatusByCourseId method
            * override this method for handling normal response from getReviewStatusByCourseId operation
            */
           public void receiveResultgetReviewStatusByCourseId(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetReviewStatusByCourseIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getReviewStatusByCourseId operation
           */
            public void receiveErrorgetReviewStatusByCourseId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLinksByReferredToType method
            * override this method for handling normal response from getLinksByReferredToType operation
            */
           public void receiveResultgetLinksByReferredToType(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetLinksByReferredToTypeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinksByReferredToType operation
           */
            public void receiveErrorgetLinksByReferredToType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveContent method
            * override this method for handling normal response from saveContent operation
            */
           public void receiveResultsaveContent(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.SaveContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveContent operation
           */
            public void receiveErrorsaveContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initializeContentWS method
            * override this method for handling normal response from initializeContentWS operation
            */
           public void receiveResultinitializeContentWS(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.InitializeContentWSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeContentWS operation
           */
            public void receiveErrorinitializeContentWS(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveCourseTOC method
            * override this method for handling normal response from saveCourseTOC operation
            */
           public void receiveResultsaveCourseTOC(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.SaveCourseTOCResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveCourseTOC operation
           */
            public void receiveErrorsaveCourseTOC(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveLink method
            * override this method for handling normal response from saveLink operation
            */
           public void receiveResultsaveLink(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.SaveLinkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveLink operation
           */
            public void receiveErrorsaveLink(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadContent method
            * override this method for handling normal response from loadContent operation
            */
           public void receiveResultloadContent(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.LoadContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadContent operation
           */
            public void receiveErrorloadContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFilteredContent method
            * override this method for handling normal response from getFilteredContent operation
            */
           public void receiveResultgetFilteredContent(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetFilteredContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFilteredContent operation
           */
            public void receiveErrorgetFilteredContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveContentsReviewed method
            * override this method for handling normal response from saveContentsReviewed operation
            */
           public void receiveResultsaveContentsReviewed(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.SaveContentsReviewedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveContentsReviewed operation
           */
            public void receiveErrorsaveContentsReviewed(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeContent method
            * override this method for handling normal response from removeContent operation
            */
           public void receiveResultremoveContent(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.RemoveContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeContent operation
           */
            public void receiveErrorremoveContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getContentFiles method
            * override this method for handling normal response from getContentFiles operation
            */
           public void receiveResultgetContentFiles(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetContentFilesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getContentFiles operation
           */
            public void receiveErrorgetContentFiles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    com.blackboard.bbdn.bbws.generated.ContentWSStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                


    }
    