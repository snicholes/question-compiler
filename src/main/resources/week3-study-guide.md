## Collections
What is the Collection API in Java?

What is the difference between a List and a Set?

What does the Iterable interface represent?

What is the difference between an ArrayList and a LinkedList?

Give examples of situations where it would be best to use each of the following, and explain why:
- ArrayList
- HashSet
- PriorityQueue

What does the forEach method do?

What is a Map?

Why are Maps not part of the Collection hierarchy?

Give an example of a situation where a Map would be a good fit.

What is the difference between a Queue and a Deque?

Summarize the Collections hierarchy.

What are some reasons we would use Collections over arrays?

What can we do if we want to store primitives in a Collection?

## Generics
What is the purpose of generics?

What is the syntax associated with generics in general?

Why would we use generics rather than just setting the types as Object?

## Testing
What is the main goal of testing?

What is the difference between positive and negative testing?

What is the difference between a test case and a test suite?

What is test-driven development?

What are the benefits of test-driven development?

How can we do test-driven development in Java?

What is unit testing?

What is the benefit of unit testing?

## JUnit
What is JUnit?

What are the main annotations in JUnit 5?

What is the purpose of assert methods?

What static import do we use for assertions in JUnit 5?

Where do JUnit test classes go in our Maven project?

Why is it best practice to only have one assertion in a test?

Give an example of a positive test case using JUnit.

Give an example of a negative test case using JUnit.

## Exceptions
What is the difference between exceptions and errors in Java?

What is the difference between checked and unchecked exceptions?

How can we handle checked exceptions?

What is the difference between "throw" and "throws"?

How do we make a custom exception?

How many catch blocks can be in a try-catch? Are there any rules regarding this?

What does the "finally" block do?

What is try-with-resources? When might this be useful?

## Lambdas & Functional Interfaces
What is a functional interface?

What is a lambda (or lambda expression)?

What are the benefits of using a lambda rather than a class?

What are some examples of functional interfaces that we've used?

What is the syntax for a lambda?

Describe what this might be doing:
```
Pettable chinchilla = () -> {
    System.out.println("the chinchilla is so soft");
}
chinchilla.pet();
```

Describe what this might be doing:
```
Servable potato = ingredient -> ("potato with a side of " + ingredient);
System.out.println(potato.serve("beans"));
```