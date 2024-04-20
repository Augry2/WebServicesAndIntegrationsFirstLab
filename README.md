# WebServicesAndIntegrationsFirstLab
first lab assignment for the Web Services And Integrations course on ITHS. The program is a simple console app where the user is asked to input a value in SEK and is then prompted to select to exchange it to either dollar or euro.

After cloning the project make sure to enable " add dependencies with '' provided '' scope to classpath " for the main class in the consumer module 

To run the program from terminal using a docker image follow these steps: 
1. Install docker desktop and run these commands in the terminal
2. docker login --username=your-dockerhub-username
3. docker pull augry/lab1webservices:latest
4. docker run -it augry/lab1webservices:latest 
