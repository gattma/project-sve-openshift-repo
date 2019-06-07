package at.fh.sve.ue4.ms.dao;

import at.fh.sve.ue4.ms.domain.Coordinates;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Alternative
@ApplicationScoped
public class ParkingDAOMockImpl implements ParkingDAO {

    private ArrayList<Coordinates> coordinatesList = new ArrayList<>();

    @Override
    public List<Coordinates> findByCity(String city) {
        return coordinatesList.stream().filter(c -> c.getCity().equals(city)).collect(Collectors.toList());
    }

    @Override
    public void create(Coordinates coordinates) {
        coordinatesList.add(coordinates);
    }
}
