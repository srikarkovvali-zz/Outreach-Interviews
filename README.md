# Outreach-Interviews
Interview questions for COOP, Capstone and employees

Master Build

[![Build Status](https://travis-ci.com/AES-Outreach/Outreach-Interviews.svg?token=Q2Kk8fYfCWzCrC5pSjcD&branch=master)](https://travis-ci.com/AES-Outreach/Outreach-Interviews)

Develop Build

[![Build Status](https://travis-ci.com/AES-Outreach/Outreach-Interviews.svg?token=Q2Kk8fYfCWzCrC5pSjcD&branch=develop)](https://travis-ci.com/AES-Outreach/Outreach-Interviews)

# Server Questions

Steps required to build and test the server questions project

## Recommended Tools

In order to build the project successfully and with the least amount of errors users should have the following installed on their work stations.

1. Eclipse or Visual Studio Code
2. Maven 3.x.y where y >=0 and x >= 5
3. Java 11
4. Understanding of Maven and HTTP requests

## How to Build
 Create an environment variable on your operating system called `OUTREACH_MAPS_KEY`. The value for the key will be the Google Maps API token which will be provided to you prior to the interview.

 If you are uncertain of creating environment variables for your operating system please read the correct article for your operating system:
 1. [Linux OS](https://www.digitalocean.com/community/tutorials/how-to-read-and-set-environmental-and-shell-variables-on-a-linux-vps)
 2. [Mac OSX](https://medium.com/@himanshuagarwal1395/setting-up-environment-variables-in-macos-sierra-f5978369b255)
 3. [Windows OS](https://helpdeskgeek.com/how-to/create-custom-environment-variables-in-windows/)

 Simply clone the repo and navigate within the `candidate-questions` and execute the following command:

 `mvn clean install`

 ## How to Test

 Simply clone the repo and navigate within the `candidate-questions` and execute the following command:

 `mvn test`

 # How to Pull Request

 In order to pull request the project results into the repository you must `Fork` the repository into your own Github account. Once the project has been forked then simply make the necessary changes to the project. Once complete create a pull request with the changes so that the owner of the project can review the necessary changes.

 Source: [Github Documentation](https://help.github.com/en/articles/fork-a-repo)

 # Contributions

- [Patrique Legault](mailto:patrique.legault@uottawa.ca)



