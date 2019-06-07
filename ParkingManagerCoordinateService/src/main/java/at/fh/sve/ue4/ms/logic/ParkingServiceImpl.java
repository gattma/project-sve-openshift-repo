package at.fh.sve.ue4.ms.logic;

import at.fh.sve.ue4.ms.dao.ParkingDAO;
import at.fh.sve.ue4.ms.domain.Coordinates;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.List;

//@RequestScoped
public class ParkingServiceImpl implements ParkingService {

    @Inject
    private Instance<ParkingDAO> parkingDAO;

    @Override
    public void addCoordinates(Coordinates coordinates) {
        parkingDAO.get().create(coordinates);
    }

    @Override
    public List<Coordinates> readCoordinate(String city) {
        return parkingDAO.get().findByCity(city);
    }
}
