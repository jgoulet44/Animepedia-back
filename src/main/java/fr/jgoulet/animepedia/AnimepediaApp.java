package fr.jgoulet.animepedia;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class AnimepediaApp extends SpringBootServletInitializer {

	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(AnimepediaApp.class);
	 }


	 public static void main(String[] args) throws Exception {
	  new AnimepediaApp().configure(new SpringApplicationBuilder(AnimepediaApp.class)).run(args);
	 }

}