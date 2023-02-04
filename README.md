# Implementing and Deploying a Java Servlet on Apache Tomcat Web Server

This project is all about a few simple steps, easily doable in any environment.

## Installation and establishment
In short, download and install Apache Tomcat Web Server (v9.0), and create your servlet project (folder) inside "webapps" in the "Tomcat 9.0" folder. Then, establish a hierarchy as below:
```
servlet-project
│   index.html
└──WEB-INF
│   │   web.xml
│   └───classes
│       │   ClassFile.class
```
Launch your Tomcat Server (default port 8080) and access it from your browser, navigating between your pages.


## Notes
The web.xml file must include the servlet name (to map it to a url pattern) and a servlet class (retrieved from "classes"). Practically, classes are subpages of index.html. They are used to display static or dynamic pages, doing all the computation and efficiently retrieving parameters from requests for a better response.
Each servlet class must extend HttpServlet.
The classes needed are automatically installed with Tomcat Server. Adding servlet-api.jar to the classpath is essential to compile the .java file of this project and reproduce it.
A screenshot of an example outcome of this project is provided.


## Requirements
- Java 1.8 or later
- Apache Tomcat Web Server 9.0

