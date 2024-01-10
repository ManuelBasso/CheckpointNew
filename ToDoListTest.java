import org.junit.Assert;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.util.List;


public class ToDoListTest {

    @Test
    public void check_if_expiringInTwoDaysTasks_return_empty_list_if_not_tasks_in_the_range() {
        ToDoList tDL = new ToDoList();
        List<Task> result = tDL.expiringInTwoDaysTasks();
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void check_if_expiringInTwoDaysTasks_return_not_empty_list_if_there_are_tasks_in_the_range() {
        Task t2 = new Task("cucinare", false, OffsetDateTime.parse("2024-01-11T12:10:10Z"));
        Task t3 = new Task("chiamare casa", false, OffsetDateTime.parse("2024-01-09T22:10:10Z"));
        ToDoList tDL = new ToDoList();
        tDL.addToList(t2);
        tDL.addToList(t3);
        List<Task> result = tDL.expiringInTwoDaysTasks();
        Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void check_if_showTaskByID_return_null_with_wrong_ID() {
        Task t2 = new Task("cucinare", false, OffsetDateTime.parse("2024-01-11T12:10:10Z"));
        String fakeID = "010101";
        ToDoList tDL = new ToDoList();
        Task expectedresult = tDL.showTaskByID(fakeID);
        Assert.assertNull(expectedresult);
    }

    @Test
    public void check_if_showTaskByID_return_task_with_correct_ID() {
        ToDoList tDL = new ToDoList();
        Task t2 = new Task("cucinare", false, OffsetDateTime.parse("2024-01-11T12:10:10Z"));
        tDL.addToList(t2);
        String fakeID = t2.getId().toString();
        Task expectedresult = tDL.showTaskByID(fakeID);
        Assert.assertEquals(t2,expectedresult);
    }


}