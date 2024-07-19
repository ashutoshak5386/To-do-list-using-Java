# ToDoList Application

This is a simple command-line ToDo List application written in Java. It allows users to manage their tasks by providing functionalities to add, view, and remove tasks.

## Project Structure

```
ToDoList/
└── src/
    └── com/
        └── todoapp/
            ├── Main.java
            ├── Task.java
            └── TaskManager.java
```

## Classes

### Main.java

The entry point of the application. It contains the main method and the command-line interface for the user to interact with the application.

### Task.java

A class representing a task. It contains the task's ID and description.

### TaskManager.java

A class that manages the tasks. It includes methods to add, view, and remove tasks from the list.

## Usage

### Compile the Project

Open a terminal and navigate to the `ToDoList` directory. Compile the Java classes using the following command:

```sh
javac -d bin src/com/todoapp/*.java
```

### Run the Application

Run the `Main` class using the following command:

```sh
java -cp bin com.todoapp.Main
```

### Commands

- **Add Task:** Allows you to add a new task by entering its description.
- **View Tasks:** Displays all the tasks in the list.
- **Remove Task:** Removes a task by entering its ID.
- **Exit:** Exits the application.

## Example

```
To-Do List Application
1. Add Task
2. View Tasks
3. Remove Task
4. Exit
Enter your choice: 1
Enter task description: Finish Java project
Task added successfully.

To-Do List Application
1. Add Task
2. View Tasks
3. Remove Task
4. Exit
Enter your choice: 2
Task ID: 1, Description: Finish Java project

To-Do List Application
1. Add Task
2. View Tasks
3. Remove Task
4. Exit
Enter your choice: 3
Enter task ID to remove: 1
Task removed successfully.
```

