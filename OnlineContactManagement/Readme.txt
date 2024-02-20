An Online Contact management system is built where it has the following fields:
1)User_id (Primary Key),2)Name,3)Phone Number and 4)Email
 

An H2 Database is used for storing and the endpoints are created
Created Log info when an article is created and modified using AOP

POST /api/v1/users – added users
GET /api/v1/users/{id} – got details about a user
PUT /api/v1/users/{id} – updated a user
DELETE /api/v1/users/{id} – deleted a user
