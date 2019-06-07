package at.fh.sve.ue04.ms.service;

import at.fh.sve.ue04.ms.domain.ParkingSpace;

import java.util.List;

public interface ParkingService {

    List<ParkingSpace> getAllParkingSpaces();

    ParkingSpace getParkingSpace(Long id);

    ParkingSpace addParkingSpace(ParkingSpace ps);
}
