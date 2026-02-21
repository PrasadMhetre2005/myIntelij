# Task Class README

## Overview
The `Task` class is designed to represent a unit of work that can be executed, managing its own state and behavior while adhering to encapsulation principles in Object-Oriented Programming (OOP).

## Encapsulation
Encapsulation is a fundamental concept in OOP that restricts direct access to some of an object's components and can prevent the accidental modification of data. The `Task` class encapsulates its properties and methods, allowing interaction only through public methods, which helps maintain control over how the task's state is modified. 

### Properties:
- **name**: Represents the name of the task.
- **status**: Indicates whether the task is pending, ongoing, or completed.

### Methods:
- **getName()**: Returns the name of the task.
- **getStatus()**: Returns the current status of the task.
- **start()**: Initiates the task and changes its status to ongoing.
- **complete()**: Marks the task as completed.

## OOP Concepts
The `Task` class incorporates several OOP concepts:
- **Abstraction**: By hiding the implementation details and exposing only the relevant functionalities, the class allows users to interact without needing to understand the underlying complexities.
- **Inheritance**: The `Task` class can be a base class for more specific types of tasks, utilizing the benefits of code reuse.
- **Polymorphism**: Methods can be overridden in subclasses to create specialized behavior while maintaining a consistent interface.

## Conclusion
The design of the `Task` class illustrates key OOP principles, promoting code organization, maintainability, and scalability.