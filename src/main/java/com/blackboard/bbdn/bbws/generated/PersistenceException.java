
/**
 * PersistenceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

package com.blackboard.bbdn.bbws.generated;

public class PersistenceException extends java.lang.Exception{
    
    private com.blackboard.bbdn.bbws.generated.GradebookWSStub.PersistenceExceptionE faultMessage;

    
        public PersistenceException() {
            super("PersistenceException");
        }

        public PersistenceException(java.lang.String s) {
           super(s);
        }

        public PersistenceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PersistenceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.blackboard.bbdn.bbws.generated.GradebookWSStub.PersistenceExceptionE msg){
       faultMessage = msg;
    }
    
    public com.blackboard.bbdn.bbws.generated.GradebookWSStub.PersistenceExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    