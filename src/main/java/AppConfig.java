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
        // Remove the setter injection that we had previously in favour of constructor injection
        // We could just return the new CustomerServiceImpl straight away to save another line

        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository()
    {
        return new HibernateCustomerRepositoryImpl();
    }
}
