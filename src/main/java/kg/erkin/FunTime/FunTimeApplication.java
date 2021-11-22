package kg.erkin.FunTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunTimeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FunTimeApplication.class, args);
		SpringApplication app = new SpringApplication(FunTimeApplication.class);
		app.setBanner((environment, sourceClass, out) -> {
			out.println("███████╗██████╗░██╗░░██╗██╗███╗░░██╗\n" +
					"██╔════╝██╔══██╗██║░██╔╝██║████╗░██║\n" +
					"█████╗░░██████╔╝█████═╝░██║██╔██╗██║\n" +
					"██╔══╝░░██╔══██╗██╔═██╗░██║██║╚████║\n" +
					"███████╗██║░░██║██║░╚██╗██║██║░╚███║\n" +
					"╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░╚══╝\n" +
					"                             \uD83C\uDD54\uD83C\uDD61\uD83C\uDD5A\uD83C\uDD58\uD83C\uDD5D");
		});
		app.run(args);
	}

}
