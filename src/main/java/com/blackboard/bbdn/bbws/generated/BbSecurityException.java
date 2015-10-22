
/**
 * BbSecurityException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

package com.blackboard.bbdn.bbws.generated;

public class BbSecurityException extends java.lang.Exception{
    
    private com.blackboard.bbdn.bbws.generated.GradebookWSStub.BbSecurityExceptionE faultMessage;

    
        public BbSecurityException() {
            super("BbSecurityException");
        }

        public BbSecurityException(java.lang.String s) {
           super(s);
        }

        public BbSecurityException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BbSecurityException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.blackboard.bbdn.bbws.generated.GradebookWSStub.BbSecurityExceptionE msg){
       faultMessage = msg;
    }
    
    public com.blackboard.bbdn.bbws.generated.GradebookWSStub.BbSecurityExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    