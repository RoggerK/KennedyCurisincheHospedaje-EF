package idat.edu.pe.curisinche.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfKennedyCurisincheHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfKennedyCurisincheHospitalApplication.class, args);
	}

}
