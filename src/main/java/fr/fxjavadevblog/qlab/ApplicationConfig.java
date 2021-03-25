package fr.fxjavadevblog.qlab;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;



@OpenAPIDefinition (
		info = @Info(title = ApplicationConfig.APP_NAME, version = ApplicationConfig.APP_VERSION),
		servers = @Server(url = ApplicationConfig.API_FULL_PATH )
	)


@ApplicationPath(ApplicationConfig.VERSIONED_API_PATH)
public class ApplicationConfig extends Application {
	
	public static final String APP_NAME = "quarkus-lab";
	public static final String APP_VERSION = "1.0.0";
	
	public static final String ROOT_PATH = "/" + APP_NAME;
	
	public static final String API_VERSION = "v1";
	public static final String API_ENDPOINT_BASEPATH = "api";	
	public static final String VERSIONED_API_PATH = "/" + API_VERSION + "/" + API_ENDPOINT_BASEPATH;
	public static final String API_FULL_PATH = ROOT_PATH + VERSIONED_API_PATH;

}
