import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    // This is now where the beans are configured in the AppConfig class
    // Implementation is now in Java and therefore looks similar to what we are used to

    @Bean(name = "customerService")
    public CustomerService getCustomerService()
    {
        CustomerServiceImpl service = new CustomerServiceImpl();
        service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository()
    {
        return new HibernateCustomerRepositoryImpl();
    }
}
