package lotto_project.tk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tk"})
public class TkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkApplication.class, args);
	}

}
