# Project Overview

## Introduction
This project is created using Cucumber with Java programming language. The project versions are stored in the archive "pom".

## Supported Browsers
Google Chrome.

## Folder Description
- **test->java->pages**: This folder contains the logic of the site pages to give each class its own instructions and properties.
- **test->java->resources**: This folder contains global classes that can be used throughout the project to avoid redundancy during development.
- **test->java->steps**: This folder executes the Cucumber logic to run processes from the feature files. Here, classes instantiate the classes from the "pages" folder.
- **test->java->steps->global**: This folder contains global classes that can be used throughout the project to avoid redundancy during development.
- **test->java->steps->sprint\***: This folder contains classes created for each sprint.
- **test->resources->features->global**: This folder contains features that can be used throughout the project.
- **test->resources->sprint\***: This folder contains the features necessary for each sprint.

## Feature File Explanation (Cucumber)
To improve writing of feature files in a Cucumber project, it is recommended to use clear and concise language, provide concrete examples, and avoid ambiguity. Additionally, it is important to organize scenarios in a logical and coherent manner, and to review and correct the document before sharing it with the development and testing team.
Using clear and concise language: It is important that the document is easy to understand for anyone who reads it, so it is recommended to avoid jargon or technical terms that may be confusing.

##Recommendations for creating .feature files:
Using concrete examples: Scenarios and use cases should be specific and representative of the functionalities being tested. It is recommended to use concrete examples and real situations to make it easier to understand the scenarios.

Avoiding ambiguity: It is important to avoid any kind of ambiguity in the feature file, as this can lead to confusion and misinterpretation. It is recommended to be clear and specific in the description of each scenario.

Organizing scenarios logically: Scenarios should be organized in a logical and coherent manner to facilitate their reading and understanding. It is recommended to group scenarios by features and use a hierarchical structure to organize them.

Reviewing and correcting the document: It is important to review and correct the feature file before sharing it with the development and testing team. It is recommended to ensure that the writing is clear and precise, and that the scenarios are well-organized and representative of the functionalities being tested.

##Example feature file:

Feature: Purchase process

	Background:
		Given that the user has authenticated in the application
	Scenario: Add product to cart
		Given that the user is on the product page
		When the user clicks the "Add to cart" button
		Then the product is added to the shopping cart

##Steps to generate a Test Case:
Is necessary to have the document with which the test cases were documented, because the name of the test case is referenced throughout the process, for example "TC_Digital_DownLoad_C_001", as well as the sprint that is being worked on for better organization in the project folders.

	To locate "test->resources->features" folder, in which a folder is created with the name of the sprint to be worked on. Inside it, all the features are stored, and the file is named correspondingly to the test case with the extension ".feature", for example, "testcase001.feature".
	To locate "test->java" folder, create the Java file with the ".Test" extension in this folder. It is important to generate a reference to the test case that will be executed
	To identify "test->java->steps" folder, create the folder with the name of the sprint that will be worked on. Inside, generate the class with the name of the test case, for example "TC_Digital_Download_C_001.java". In this class, define the steps using Java annotations "@Given()", "@When()", and "@Then()"
