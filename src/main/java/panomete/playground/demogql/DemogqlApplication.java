package panomete.playground.demogql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemogqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemogqlApplication.class, args);
    }

}
