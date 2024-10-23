### Introduction to Spring Framework

I implemented a basic Spring application demonstrating key concepts of the Spring Framework, particularly dependency injection.

#### Functionality
- **MessageService**: A component that provides a method to return a message ("Hello World!").
- **MessagePrinter**: A component that depends on `MessageService`. It retrieves and prints the message using the `printMessage()` method.

#### Key Concepts
- **Dependency Injection**: Achieved through constructor injection in `MessagePrinter`, allowing Spring to provide an instance of `MessageService`.
- **Spring Components**: The use of `@Component` for both classes enables Spring to manage them as beans, aiding in easy wiring and lifecycle management.