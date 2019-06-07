package at.fh.sve.ue04.ms.service;

import at.fh.sve.ue04.ms.dao.ParkingDAO;
import at.fh.sve.ue04.ms.domain.ParkingSpace;

import javax.inject.Inject;
import java.util.List;

public class ParkingServiceImpl implements ParkingService {

    @Inject
    private ParkingDAO parkingDAO;

    public List<ParkingSpace> getAllParkingSpaces() {
        return this.parkingDAO.getAllParkingSpaces();
    }

    public ParkingSpace getParkingSpace(Long id) {
        return this.parkingDAO.getParkingSpace(id);
    }

    public ParkingSpace addParkingSpace(ParkingSpace ps) {
        return this.parkingDAO.addParkingSpace(ps);
    }
}
