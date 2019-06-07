package at.fh.sve.ue4.ms.dao;

import at.fh.sve.ue4.ms.domain.Coordinates;

import java.util.List;

public interface ParkingDAO {
    List<Coordinates> findByCity(String city);
    void create(Coordinates coordinates);
}
