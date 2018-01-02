import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig
{
    @Bean(name = "customerService")
    public CustomerService getCustomerService()
    {
        CustomerServiceImpl service = new CustomerServiceImpl();
        return service;
    }

    // No longer need a bean defined for the customerRepository as the
    // autowired annotation allows this to occur due to the fact that
    // the HibernateImpl class is within the "com.pluralsight" package
    // that we are component scanning on.
}
