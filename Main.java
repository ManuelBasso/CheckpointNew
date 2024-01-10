import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task t1 = new Task("comprare regali", false, OffsetDateTime.parse("2024-02-01T22:10:10Z"));
        Task t2 = new Task("cucinare", false, OffsetDateTime.parse("2024-01-11T22:10:10Z"));
        Task t3 = new Task("chiamare casa", false, OffsetDateTime.parse("2024-01-10T22:10:10Z"));

        ToDoList tDL = new ToDoList();

        System.out.println("Adding 3 tasks to list");
        checkAddOperation(tDL.addToList(t1));
        checkAddOperation(tDL.addToList(t2));
        checkAddOperation(tDL.addToList(t3));
        System.out.println("Show list");
        tDL.printList();
        System.out.println(" ");

        System.out.println("Removing 1 task to list");
        checkRemoveOperation(tDL.removeToList(t1));
        System.out.println("Show list");
        tDL.printList();
        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        System.out.println("Insert Id of the task to change status:");
        String id = input.next();
        System.out.println("Would do you like it to change it in Completed (digit true) or not completed(digit false)");
        Boolean choice = input.nextBoolean();
        checkChangeStatus(tDL.changeStatus(id, choice));
        System.out.println("Show list");
        tDL.printList();
        System.out.println(" ");

        System.out.println("Insert id of the task to show:");
        id = input.next();
        checkTaskNotNull((tDL.showTaskByID(id)));
        System.out.println(" ");

        System.out.println("Show tasks expiring in 2 days, with a readable data format");
        List<Task> expiringList = tDL.expiringInTwoDaysTasks();
        formatData(expiringList);

    }

    private static void checkAddOperation(Boolean isAdded) {
        if (isAdded) {
            System.out.println("Task added to list");
        } else {
            System.out.println("Error, task not added to list");
        }
    }

    private static void checkRemoveOperation(Boolean isRemoved) {
        if (isRemoved) {
            System.out.println("Task removed from list");
        } else {
            System.out.println("Error, task not removed from list");
        }
    }

    private static void checkChangeStatus(Boolean isChanged) {
        if (isChanged) {
            System.out.println("Status changed");
        } else {
            System.out.println("Error, status non changed");
        }
    }

    private static void checkTaskNotNull(Task t) {
        if (t != null) {
            System.out.println(t);
        } else {
            System.out.println("Error, Id is not correct");
        }
    }

    private static void formatData(List<Task> toFormat) {
        for (Task t : toFormat) {
            System.out.println("Task{" +
                    "description='" + t.getDescription() + '\'' +
                    ", completed=" + t.getCompleted() +
                    ", expiration=" + t.getExpiration().format(DateTimeFormatter.ofPattern("dd MMMM yyyy - HH:mm:ss").localizedBy(Locale.ITALY)) +
                    ", id=" + t.getId() +
                    '}');
        }
    }
}
