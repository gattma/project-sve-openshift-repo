package at.fh.sve.ue4.ms.config;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerProducer {

    @Produces
    @RequestScoped
    public EntityManager createEntityManager() {
        try {
            return Persistence
                    .createEntityManagerFactory("restapi-unit")
                    .createEntityManager();
        } catch (Exception e){
            System.out.println("Mongo db not started." + e.getMessage());
            return null;
        }
    }

    public void close(EntityManager entityManager) {
        entityManager.close();
    }

}
