package at.fh.sve.ue04.ms.dao;

import at.fh.sve.ue04.ms.domain.ParkingSpace;

import java.util.List;

public interface ParkingDAO {

    List<ParkingSpace> getAllParkingSpaces();

    ParkingSpace getParkingSpace(Long id);

    ParkingSpace addParkingSpace(ParkingSpace ps);

}
