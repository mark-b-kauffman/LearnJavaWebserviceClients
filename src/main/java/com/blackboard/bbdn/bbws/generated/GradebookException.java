/**
 * GradebookException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.blackboard.bbdn.bbws.generated;

public class GradebookException extends java.lang.Exception {
    private com.blackboard.bbdn.bbws.generated.GradebookWSStub.GradebookException0 faultMessage;

    public GradebookException() {
        super("GradebookException");
    }

    public GradebookException(java.lang.String s) {
        super(s);
    }

    public GradebookException(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.blackboard.bbdn.bbws.generated.GradebookWSStub.GradebookException0 msg) {
        faultMessage = msg;
    }

    public com.blackboard.bbdn.bbws.generated.GradebookWSStub.GradebookException0 getFaultMessage() {
        return faultMessage;
    }
}
