## Javalin

What is the Context object?

What is the benefit of using app.routes() instead of basic app.get()/.post() methods?

What is the Handler interface?

What does the handle method signature look like?

What does the ctx.json() method do?

Which Context method would we use to get a JSON object from the request body?

What is the difference between query params and path params?

How do we set the status code of our response?

How do we retrieve a path param? How is the name determined?

Why might we want to have Controller classes rather than put our code directly into the Javalin setup like before?

What is Jackson? How does Javalin use it?

## SQL

What is a relational database?

What is an RDBMS?

What is SQL?

What are the sublanguages of SQL? Write a bit about each one.

What is the difference between INSERT and CREATE?

What is the difference between UPDATE and ALTER?

What is the difference between DELETE, DROP, and TRUNCATE?

What are constraints?

What is a schema?

What does the "serial" type represent?

Why do we want to avoid double-quotes as much as possible in SQL?

What is a primary key?

What is a foreign key and why would we use a foreign key constraint?

What makes a good primary key?

What is the difference between a natural key and a surrogate key?

When might we want to use ROLLBACK?

What does the WHERE clause do?

What are the different types of joins in SQL? Give examples of when we might want to use each one.

What is a transaction?

After which kinds of statements do we need to use TCL?

What are the ACID properties? Why are these important?

What is the difference between scalar and aggregate functions? Give some examples of each.

What are the set operations? Give an example of one and when it would be useful.

What is transaction isolation?

What is database normalization?

Why would we want our database to be normalized?

## JDBC

What is JDBC?

What are the main interfaces in JDBC that we use?

How do we set up JDBC in our application?

Why do we need a JDBC driver in our Maven dependencies if JDBC is included in Java?

What is the purpose of the ConnectionUtil?

What properties need to be in your database.properties file?

What is the general process for running a SQL statement using JDBC in your code?

What is the difference between Statement and PreparedStatement?

What is a ResultSet?

How do we get the generated primary key value after an insert statement using JDBC?

Why do we use try-with-resources when we use a Connection object?

## Mockito

What is Mockito?

Why do we mock methods for our tests?

What do "when" and "then" methods do in Mockito?

What are the main annotations we use with Mockito?

What does the "verify" method do? Give an example of when we might use it.

How do we know which methods we need to mock?

What do we need to do to setup Mockito in our application?