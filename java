The default CentOS 8 repositories include the latest two major Java LTS versions, Java 8 and Java 11

$ sudo yum install java-11-openjdk-devel -y 

$ java -version

To install only the headless OpenJDK 11
---------------------------------------

$ sudo yum install java-11-openjdk-headless  -y

Installing OpenJDK 8
--------------------

$ sudo yum install java-1.8.0-openjdk-devel -y

$ java -version 

For minimal Java runtime, install the java-1.8.0-openjdk-headless package.

$ sudo yum install java-1.8.0-openjdk-headless -y

--If you want to change the default version, use the alternatives command:

$ sudo alternatives --config java


Setting the JAVA_HOME Environment Variable
--------------------------------------------
JAVA_HOME variable on a per-user basis add it to the ~/.bashrc or any other configuration file which is loaded when the user logs in. For system-wide setting, use a script inside the /etc/profile.d directory.

$ sudo vi /etc/profile.d/java.sh

JAVA_HOME="/usr/lib/jvm/java-1.8.0-openjdk"

$ source /etc/profile.d/java.sh

$ echo $JAVA_HOME


You can also set the JAVA_HOME in the application configuration, systemd unit file, or on the command line when launching the program.

For example to run Maven using Java 8 you would type:

$ JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk mvn --version

