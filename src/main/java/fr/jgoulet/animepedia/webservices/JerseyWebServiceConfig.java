package fr.jgoulet.animepedia.webservices;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api")
public class JerseyWebServiceConfig extends ResourceConfig {
	public JerseyWebServiceConfig(){
		packages("fr.jgoulet.animepedia.webservices.resources");
	}
}

