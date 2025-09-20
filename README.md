# ToDoList Java Application

## Overview
This is a simple command-line To-Do List application written in Java. It allows users to manage tasks by adding, removing, clearing, and displaying tasks through an interactive menu.

## Features
- **Add Task**: Add a new task to the list (up to 100 tasks).
- **Remove Task**: Mark a task as "Done" by specifying its number.
- **Clear List**: Clear all tasks from the list.
- **Show Tasks**: Display all tasks with their respective numbers.
- **Exit Program**: Terminate the application.

## How to Run
1. **Prerequisites**: Ensure you have Java Development Kit (JDK) installed (version 8 or higher).
2. **Compile the Program**:
   ```bash
   javac ToDoList.java
   ```
3. **Run the Program**:
   ```bash
   java ToDoList
   ```
4. Follow the on-screen prompts to interact with the application.

## Usage
- On startup, enter your first task.
- After adding the first task, a menu appears with the following options:
  - **1**: Add a new task.
  - **2**: Remove a task (marks it as "Done Task").
  - **3**: Clear the entire task list.
  - **4**: Display all tasks.
  - **5**: Exit the program.
- Enter a number (1–5) to select an option, then follow the prompts.

## Limitations
- The task list has a fixed size of 100 tasks.
- The `RemoveTask` method currently marks tasks as "Done Task" instead of removing them from the array.
- The program does not persist tasks between sessions (tasks are stored in memory only).
- Error handling in the `RemoveTask` method may not function as intended for invalid indices.

## Code Structure
- **Main Class**: `ToDoList`
- **Key Methods**:
  - `AddTask(String[], String)`: Adds a task to the array and increments the task counter.
  - `RemoveTask(String[], int)`: Marks a task as "Done" based on its index.
  - `ShowTasks(String[])`: Displays all tasks in the list.
  - `ClearList()`: Resets the task counter to clear the list.
- **Static Variables**:
  - `TaskNums`: Tracks the number of tasks (starts at -1 for an empty list).
  - `tasksAdded`: Array to store up to 100 tasks.

## Notes
- The program includes a 1-second delay (`Thread.sleep(1000)`) after each menu operation for user experience.
- The `RemoveTask` method has a logical error in its condition checking, which may need fixing for proper index validation.
- Future improvements could include persistent storage, better task removal logic, and enhanced error handling.