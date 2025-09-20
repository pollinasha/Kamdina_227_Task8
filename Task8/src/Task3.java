import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(TaskPriority.LOW, "Купить пылесос."));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");

        for(Task item : tasks) {
            if (item.getPriority() == TaskPriority.HIGH)
                System.out.println(item);
        }
    }
}

class Task {

    protected TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    // добавьте конструктор класса
    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // добавьте метод get для приоритета
    public TaskPriority getPriority() {
        return this.priority;
    }

    public String getDescription() {
        return description;
    }
}

enum TaskPriority {
    HIGH,
    MEDIUM,
    LOW
}