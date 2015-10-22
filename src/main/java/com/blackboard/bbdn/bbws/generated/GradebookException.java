
/**
 * GradebookException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

package com.blackboard.bbdn.bbws.generated;

public class GradebookException extends java.lang.Exception{
    
    private com.blackboard.bbdn.bbws.generated.GradebookWSStub.GradebookExceptionE faultMessage;

    
        public GradebookException() {
            super("GradebookException");
        }

        public GradebookException(java.lang.String s) {
           super(s);
        }

        public GradebookException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GradebookException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.blackboard.bbdn.bbws.generated.GradebookWSStub.GradebookExceptionE msg){
       faultMessage = msg;
    }
    
    public com.blackboard.bbdn.bbws.generated.GradebookWSStub.GradebookExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    