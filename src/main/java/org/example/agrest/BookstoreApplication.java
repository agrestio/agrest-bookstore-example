package org.example.agrest;

import io.agrest.runtime.AgBuilder;
import io.agrest.runtime.AgRuntime;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.jcache.JCacheModule;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import java.net.URL;

@ApplicationPath("/api/*")
public class BookstoreApplication extends ResourceConfig {

    public BookstoreApplication() {

        URL config = getClass().getClassLoader().getResource("ehcache.xml");

        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-project.xml")
                .addModule(b -> JCacheModule.contributeJCacheProviderConfig(b, config.toString()))
                .build();

        AgRuntime agRuntime = AgBuilder.build(cayenneRuntime);
        super.register(agRuntime);

        packages("org.example.agrest");

    }
}
