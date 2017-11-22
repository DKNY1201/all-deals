# all-deals
Help people buy goods with cheap price

I.	Set up Web environment
1.	Use IntelliJ to Open our project: File -> Open
2.	Right click on Folder name -> Add Framework Support…
3.	Check on Web Application -> OK
4.	Delete the folder “web” folder that was created automatically
5.	Select File -> Project Structure…
6.	Select Facets -> Web -> Web Resource Directory -> Edit icon
7.	Browse to “webapp” folder under “main” folder -> OK -> OK again to close 

II.	Setup Glassfish Server
1.	Download Glasshfish server from http://download.oracle.com/glassfish/5.0/release/glassfish-5.0-web.zip
2.	Select Edit configurations…
3.	Select + button -> GlassFish Server -> Local
4.	Give a name for the Server -> Select the folder contains the GlassFish server on hard drive -> Select domain -> Click Fix to create Artifacts
5.	Put all Maven dependencies to “WEB-INF/lib” folder


III.	Configure the database
1.	Configure database information in application.properties file
2.	Create a database name alldeals
3.	Run project to create tables
4.	Copy all the query in populate.sql and run it in MySQL client e.g: MySQL Workbench

