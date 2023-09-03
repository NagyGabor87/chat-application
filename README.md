# chat-application
Real time chat application made with Spring Boot, React and Websocket

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Setup](#setup)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Contact](#contact)


## General Information 
This project has been created to understand Websocket and create an application based on it
by using Spring boot as a backend and React as a frontend.

## Technologies Used

Spring Boot 3.1.3
Java 17 (Maven project with Jar packaging)
Dependencies : Spring Web, Websocket, Lombok
React.js 18
SockJS and StompJS

## Features

Single routes for page and chat application page
Public and Private messages can be send on the website
Name of the members are highlighted in different colors while chatting

## Setup

If you want to run Spring Boot from the JAR file in the terminal/console: 

when you are in the project folder, just simply write "mvn package" and run it
this will create a target folder with a JAR file inside (remember the name of it, you will need it in the next step)
after that enter the target folder and run the following command :java -jar "name of the JAR file".jar
and Spring Boot is now running in your terminal.

To run the frontend from the console as well, you need to open another terminal.
with this one you need to be in the frontend folder of the project
If you already have npm installed on your computer: 
run the "npm start" command to start your frontend.
If you don't have it installed:
run the npm install command, and after that run the npm start 
(if there is any issue with the start, you can run npm audit fix-- force to solve issues)

If you run the project from an IDE like IntelliJ:

Open the project folder, in the run configurations , hit the green right arrow next to ChatApplication 
to start Spring boot.
You need to do the same npm start / npm install in the terminal just as in the console start.


## Project Status
Currently, Still in Progress. I still want to implement some features in the future.

## Room for Improvement

Room for improvement :
- Further refactor the existing code
- Update the program whenever it is possible

To-Do list:
- Implement Register/Login methods with Spring Security and JWT
- In the chat application, implement a logout section, where others can see a user has left the chat.
- add more CSS and style to the website
- Further ideas will be included here later



## Contact

You can contact me on LinkedIn : https://www.linkedin.com/in/g%C3%A1bor-nagy-33b197267/
You can visit any other projects at my GitHub : https://github.com/NagyGabor87






