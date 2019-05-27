# Outreach-Interviews
Interview questions for COOP, Capstone and employees

Master Build

[![Build Status](https://travis-ci.com/AES-Outreach/Outreach-Interviews.svg?token=Q2Kk8fYfCWzCrC5pSjcD&branch=master)](https://travis-ci.com/AES-Outreach/Outreach-Interviews)

Develop Build

[![Build Status](https://travis-ci.com/AES-Outreach/Outreach-Interviews.svg?token=Q2Kk8fYfCWzCrC5pSjcD&branch=develop)](https://travis-ci.com/AES-Outreach/Outreach-Interviews)

# How to Build
 Create an environment variable on your operating system called `OUTREACH_MAPS_KEY`. The value for the key will be the Google Maps API token which will be provided to you prior to the interview.

 If you are uncertain of creating environment variables for your operating system please read the correct article for your operating system:
 1. [Linux OS](https://www.digitalocean.com/community/tutorials/how-to-read-and-set-environmental-and-shell-variables-on-a-linux-vps)
 2. [Mac OSX](https://medium.com/@himanshuagarwal1395/setting-up-environment-variables-in-macos-sierra-f5978369b255)
 3. [Windows OS](https://helpdeskgeek.com/how-to/create-custom-environment-variables-in-windows/)

 Simply clone the repo and navigate within the `candidate-questions` and execute the following command:

 `mvn clean install`

 # Purpose (Creating API key only)

 The purpose of this repo is to provide students with a sample project that they can then use in order to interact with Google Maps.

 In order to create an API key log in with `Patrique's` GMAIL profile and create a new API key. 

 The URL to do so is here: `https://console.developers.google.com/apis/credentials?project=outreach-v2-1528904629755&authuser=0`

 # How to Test

 Simply clone the repo and navigate within the `candidate-questions` and execute the following command:

 `mvn test`

 # How to Pull Request

 In order to pull request the project results into the repository you must `Fork` the repository into your own Github account. Once the project has been forked then simply make the necessary changes to the project. Once complete create a pull request with the changes so that the owner of the project can review the necessary changes.

 Source: [Github Documentation](https://help.github.com/en/articles/fork-a-repo)

 # Contributions

- [Patrique Legault](mailto:patrique.legault@uottawa.ca)



