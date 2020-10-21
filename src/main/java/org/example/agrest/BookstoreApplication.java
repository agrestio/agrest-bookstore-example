package org.example.agrest;

import io.agrest.cayenne.AgCayenneBuilder;
import io.agrest.cayenne.AgCayenneModule;
import io.agrest.runtime.AgBuilder;
import io.agrest.runtime.AgRuntime;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api/*")
public class BookstoreApplication extends ResourceConfig {

    public BookstoreApplication() {

        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-project.xml")
                .build();
        AgCayenneModule cayenneExt = AgCayenneBuilder.build(cayenneRuntime);
        AgRuntime agRuntime = new AgBuilder().module(cayenneExt).build();

        register(agRuntime);
        packages("org.example.agrest");
    }
}
