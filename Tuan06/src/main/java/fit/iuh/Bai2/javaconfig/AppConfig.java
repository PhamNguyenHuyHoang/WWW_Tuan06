package fit.iuh.Bai2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address("Dak Lak", "Krong Pac", "Vietnam");
    }

    @Bean
    public Employee employee() {
        return new Employee(301, "Pham Van D", address());
    }
}
