package at.fh.sve.ue04.ms.config;

import at.fh.sve.ue04.ms.rest.ParkingResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(ParkingResource.class);
        return resources;
    }

}
