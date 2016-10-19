# Project-
Java Projects git Initial 

Step 1: Download JDK
Goto Java SE download site @ http://www.oracle.com/technetwork/java/javase/downloads/index.html.
Under "Java Platform, Standard Edition" ⇒ "Java SE 8u{xx}", where {xx} is the latest update number ⇒ Click the "JDK Download" button.
Check "Accept License Agreement".
Choose your operating platform, e.g., "Windows x64" (for 64-bit Windows OS) or "Windows x86" (for 32-bit Windows OS). You can check whether your Windows OS is 32-bit or 64-bit via "Control Panel" ⇒ "System" ⇒ Under "System Type".
Step 2: Install JDK and JRE
Run the downloaded installer (e.g., "jdk-8u{xx}-windows-x64.exe"), which installs both the JDK and JRE. By default, the JDK will be installed in directory "C:\Program Files\Java\jdk1.8.0_xx", where xx denotes the latest upgrade number; and JRE in "C:\Program Files\Java\jre1.8.0_xx".
For novices, accept the defaults. Follow the screen instructions to install JDK and JRE.
Check the JDK installed directory by inspecting these folders using File Explorer. Take note of your JDK installed directory, which you will need in the next step.
JDK_Path.png
I shall refer to the JDK installed directory as <JAVA_HOME>, hereafter, in this article.
Step 3: Include JDK's "bin" Directory in the PATH
Windows OS searches the current directory and the directories listed in the PATH environment variable for executable programs. JDK's programs (such as Java compiler javac.exe and Java runtime java.exe) reside in directory "<JAVA_HOME>\bin" (where <JAVA_HOME> denotes the JDK installed directory). You need to include "<JAVA_HOME>\bin" in the PATH to run the JDK programs.
To edit the PATH environment variable in Windows XP/Vista/7/8/10:
Launch "Control Panel" ⇒ "System" ⇒ Click "Advanced system settings".
Switch to "Advanced" tab ⇒ "Environment Variables".
Under "System Variables", scroll down to select "Path" ⇒ "Edit...".
(CAUTION: Read this paragraph 3 times before doing this step! There is no UNDO)
For Windows 10: You see a table listing the existing PATH entries. Click "New" ⇒ Enter the JDK's binary directory "c:\Program Files\Java\jdk1.8.0_xx\bin" (Replace xx with your installation's upgrade number!!!) ⇒ Select "Move Up" to move it all the way to the top.
Prior to Windows 10: In "Variable value" field, INSERT "c:\Program Files\Java\jdk1.8.0_xx\bin" (Replace xx with your installation upgrade number!!!) IN FRONT of all the existing directories, followed by a semi-colon (;) which separates the JDK's binary directory from the rest of the existing directories. DO NOT DELETE any existing entries; otherwise, some existing applications may not run.
Variable name  : PATH
Variable value : c:\Program Files\Java\jdk1.8.0_xx\bin;[exiting entries...]
Step 4: Verify the JDK Installation
Launch a CMD shell (Click "Start" button ⇒ run... ⇒ enter "cmd"; OR from "Start" button ⇒ All Programs ⇒ Accessories ⇒ Command Prompt).
Issue "path" command to list the contents of the PATH environment variable. Check to make sure that your <JAVA_HOME>\bin is listed in the PATH.
// Display the PATH entries
prompt> path
PATH=c:\Program Files\Java\jdk1.8.0_xx\bin;[other entries...]
Don't type prompt>, which denotes the command prompt!!! Key in the command (highlighted) only.
Issue the following commands to verify that JDK/JRE are properly installed and display their version:
// Display the JRE version
prompt> java -version
java version "1.8.0_xx"
Java(TM) SE Runtime Environment (build 1.8.0_xx-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.5-b02, mixed mode)
 
// Display the JDK version
prompt> javac -version
javac 1.8.0_xx
