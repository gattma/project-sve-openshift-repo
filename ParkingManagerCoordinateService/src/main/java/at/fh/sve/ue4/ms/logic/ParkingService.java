package at.fh.sve.ue4.ms.logic;


import at.fh.sve.ue4.ms.domain.Coordinates;

import java.util.List;


public interface ParkingService {
    void addCoordinates(Coordinates coordinates);
    List<Coordinates> readCoordinate(String city);
}
