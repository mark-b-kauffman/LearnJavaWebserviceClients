This git repo contains all of the .java client code necessary for making Web Service calls to Blackboard Learn 9.1 web services.

The content was created by downloading all of the Learn WSDL files for the October 2014 release, then running a command similar to the following for each WSDL file:
wsdl2java.sh -S "src/main/java" -p "com.blackboard.bbdn.bbws.generated" -R "src/main/resources/META-INF" -d "adb" -uri "./Course.WS.xml"

We had Apache Axis 2 installed in ~/axis/axis2-1.5.6 and that it's bin directory was in the environment's PATH.

ganymede:Learn.WSDL.Files mbk$ wsdl2java.sh
 Using AXIS2_HOME:   /Users/mbk/axis/axis2-1.5.6
 Using JAVA_HOME:       /Library/Java/JavaVirtualMachines/jdk1.7.0_55.jdk/Contents/Home
Usage: WSDL2Java [options] -uri <url or path> : A url or path to a WSDL

Author: Mark Bykerk Kauffman, Blackboard Inc., standing on the shoulders of giants. My part in this was to pull the Learn WSDL files and then run the Apache Axis2 wsdl2java.sh on each. Much credit to Bruce Philip's Tutorials at http://www.brucephillips.name/blog/index.cfm/2011/6/8/Blackboard-Learn-91-Web-Services-Tutorials-and-Documentation
