how to run this project.
1. craeate a webservice project of your choice.
2. use the cxf-gen-plugin to generate interface's for camel server to consume.
3. configure the routes
4. run mvn jetty:run -Djetty.port=[place desired port here]8889
5. access: http://localhost:8889/camel-cxf-server/webservices/testService?wsdl
6. you can use soapUI to call the webservice in camel 
