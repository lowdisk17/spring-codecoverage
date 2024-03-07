# spring-codecoverage
A simple project to kickstart your spring boot and jacoco journey

Note: 
In testing run the application by using any idea of your choice (example VSCode), 
by using postman or any other testing application you can check the validity of the application.

- Sample Request : GET localhost:8080/service
- Sample Reponse : Success
- To generate jacoco files open your terminal and use the command:
  - java -jar target/jacoco-0.8.10/lib/jacococli.jar report target/jacoco.exec --sourcefiles src/main/java --classfiles target/classes/ --html jacoco_output
- To check the generated files go to jacoco_output and open the html files accordingly to your package and classes
