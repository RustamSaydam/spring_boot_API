# Use the Open JDK 16 as the base image
FROM openjdk:16



#Create a new app directory for my application  files
RUN mkdir /app


#Copy the app files from host machine to image filesystem
COPY target/classes/kameleoon/ /app


#Set the directory for executing future commands
WORKDIR /app

# Run the Main Class
CMD java kameleoon/springbootApp/SpringBootCRUD