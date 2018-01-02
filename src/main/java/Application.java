import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // service and service2 will have the same object address as we have scoped it as a singleton!
        // This means we are getting the same object back
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service);

        CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
