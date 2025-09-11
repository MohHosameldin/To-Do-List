import java.util.Scanner;
public class ToDoList{
static int TaskNums=-1;
static String tasksAdded[];
public static void main(String[] args) {
    tasksAdded= new String[100];
Scanner in= new Scanner(System.in);
int num;
String Task;
while (true) {
    if(TaskNums==-1){
    System.out.print("Enter your first task: ");
    Task= in.nextLine();
AddTask(tasksAdded,Task);
}

  else  if (TaskNums>=0){
    System.out.println("Press 1 for task adding");
    System.out.println("Press 2 for task remove");
    System.out.println("Press 3 for clearing the list");
    System.out.println("Press 4 for showing the tasks");
    System.out.println("Press 5 for Ending the program");
    int x;
    x=in.nextInt();
    in.nextLine();
 
switch (x) {
    case 1:
        System.out.println("Please enter your number "+(TaskNums+2)+" task");
        Task=in.nextLine();
        AddTask(tasksAdded, Task);
        break;
        case 2:
         try {
    Thread.sleep(1000); 
} catch (InterruptedException e) {
    System.out.println("Sleep interrupted: " + e.getMessage()); }
        ShowTasks(tasksAdded);
        System.out.println("Please enter the number of done task");
                num=in.nextInt();
                RemoveTask(tasksAdded, num);

        break;
        case 3:
        ClearList();
        break;
        case 4:
        ShowTasks(tasksAdded);
        break;
         case 5:
         System.out.println("Thank you for visting");
        return;

    default:
System.out.println("Invalid, please make a right choice");
        break;
}    }

   
   try {
    Thread.sleep(1000); 
} catch (InterruptedException e) {
    System.out.println("Sleep interrupted: " + e.getMessage());
}

}
    
  




}

public static void AddTask(String arr[], String Task){
if (TaskNums==99){
System.out.println("List is full");
System.out.println("You should remove a task at least");
return;
}

    else
    {
    TaskNums++;

arr[TaskNums]=Task;
}
}

public static void RemoveTask(String arr[], int x){
if ((TaskNums)<x-1){
       System.out.println("ERROR, this task does not exist yet");

 arr[x-1]="Done Task";
   System.out.println("Done");
}
else{

    
 arr[x-1]="Done Task";
   System.out.println("Done");
}
}

public static void ShowTasks(String arr[]){
    if (TaskNums>=0){
for(int i=0; i<=TaskNums; i++){


System.out.println("Task number "+(i+1)+" : "+arr[i]);
System.out.println();
System.out.println();

    

}

}
else{
    System.out.println("ERROR, No tasks entered yet");
}

}
public static void ClearList(){
    if (TaskNums==-1){
        System.out.println("List is already cleared!");
    }
TaskNums=-1;
System.out.println("List is Succesfully cleared ");
}
}