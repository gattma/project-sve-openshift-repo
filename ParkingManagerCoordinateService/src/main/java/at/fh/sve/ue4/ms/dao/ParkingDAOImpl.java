package at.fh.sve.ue4.ms.dao;

import at.fh.sve.ue4.ms.domain.Coordinates;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ParkingDAOImpl implements ParkingDAO {

    @Inject
    private EntityManager em;

    @Override
    public List<Coordinates> findByCity(String city) {
        return em.createQuery(
                "SELECT c FROM Coordinates c WHERE c.city = :city")
                .setParameter("city", city)
                .getResultList();
    }

    @Override
    public void create(Coordinates coordinates) {
        em.persist(coordinates);
        em.flush();
    }
}
