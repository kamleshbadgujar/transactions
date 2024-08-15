Steps to run the application:

1. Take a clone of the repo

2. Go in the project directory, i.e. transactions, and run below command 

	java -jar transactions-0.0.1-SNAPSHOT.jar

3. Access the APIs using postman
 	1. POST http://localhost:8080/accounts
		{
    		"documentNumber": "13243234efv",
   	 	"firstName": "Kamlesh",
    		"lastName": "Badgujar",
    		"taxIdentifier": "AW234RDA"
	}

	2. POST http://localhost:8080/transactions

			{
    "accountId": 4,
    "operationTypeId": 2,
    "amount": 123.45
}