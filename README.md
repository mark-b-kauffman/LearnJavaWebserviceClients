This git repo contains all of the Java client classes necessary for making Web Service calls to Blackboard Learn 9.1 web services.

The content was created by downloading all of the Learn WSDL files then running a command similar to the following for each WSDL file:
wsdl2java.sh -S "src/main/java" -p "com.blackboard.bbdn.bbcoursews.generated" -t -R "src/main/resources/META-INF" -d "adb" -uri "./Course.WS.xml"

We had Apache Axis 2 installed in ~/axis/axis2-1.3 and that it's bin directory was in the environment's PATH.

ganymede:Learn.WSDL.Files mbk$ wsdl2java.sh
 Using AXIS2_HOME:   /Users/mbk/axis/axis2-1.3
 Using JAVA_HOME:       /Library/Java/JavaVirtualMachines/jdk1.7.0_55.jdk/Contents/Home
Usage: WSDL2Java [options] -uri <url or path> : A url or path to a WSDL

