/**
 * BbSecurityException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.blackboard.bbdn.bbws.generated;

public class BbSecurityException extends java.lang.Exception {
    private com.blackboard.bbdn.bbws.generated.GradebookWSStub.BbSecurityException2 faultMessage;

    public BbSecurityException() {
        super("BbSecurityException");
    }

    public BbSecurityException(java.lang.String s) {
        super(s);
    }

    public BbSecurityException(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.blackboard.bbdn.bbws.generated.GradebookWSStub.BbSecurityException2 msg) {
        faultMessage = msg;
    }

    public com.blackboard.bbdn.bbws.generated.GradebookWSStub.BbSecurityException2 getFaultMessage() {
        return faultMessage;
    }
}
