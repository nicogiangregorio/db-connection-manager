db-connection-manager
=====================

A very simple DB connection manager

This repository contains a very simple database connection manager. I often need this kind of feature when starting a brand new project.
While it is not so difficult to implement, I prefer to hold a reference in github so I can simply ccopy and paste.

This project contains only 1, very short java class.

To configure and test the correctness of code within a java web application based on tomcat, 
you should add the following lines to your web.xml file (assuming the jndi resource is 'jdbc/postgres'):

[code]
<resource-ref>
  	<description>postgreSQL Datasource example</description>
		<res-ref-name>jdbc/postgres</res-ref-name>
		<res-type>javax.sql.DataSource</res-type>
		<res-auth>Container</res-auth>
</resource-ref>
[/code]

Put the wolloeing code inside the contex.xml file:

<Resource  
    name="jdbc/postgres"
    auth="Container"
    type="javax.sql.DataSource"
    maxActive="4"
    maxIdle="2"
    username="postgres"
    maxWait="5000"
    driverClassName="org.postgresql.Driver"
    password="yourpassword"
    url="jdbc:postgresql://127.0.0.1:5432/mydb"/>
    
That's all