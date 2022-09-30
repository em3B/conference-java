import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {
//    note 2

    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
