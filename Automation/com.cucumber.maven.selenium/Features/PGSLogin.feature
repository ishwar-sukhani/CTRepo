Feature: I want to test PGS Login Functionality 

	Scenario:	Test PGS Login funcitonality with correct credentials 
		Given chrome browser and application
		When correct username and password is entered
		Then login should be successful
