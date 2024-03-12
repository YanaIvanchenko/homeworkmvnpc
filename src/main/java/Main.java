import ru.netology.services.ScheduleService;

public class Main {

    public static void main(String[] args) {
        ScheduleService service = new ScheduleService();
        int count = service.calcCount(50_000, 26_000, 60_000);

        System.out.println("Количество месяцев отдыха " + count);
    }

}