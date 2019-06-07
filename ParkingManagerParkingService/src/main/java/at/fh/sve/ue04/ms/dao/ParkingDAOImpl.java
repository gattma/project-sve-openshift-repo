package at.fh.sve.ue04.ms.dao;

import at.fh.sve.ue04.ms.domain.Address;
import at.fh.sve.ue04.ms.domain.Coordinate;
import at.fh.sve.ue04.ms.domain.ParkingSpace;

import java.util.*;

public class ParkingDAOImpl implements ParkingDAO {

    // TODO access DB

    private List<ParkingSpace> DUMMY_PARKING_SPACES = new ArrayList<ParkingSpace>() {{
        add(new ParkingSpace(
                        1L,
                        new Address(4030L, "Linz", "Erich-Fried-Weg"),
                        new Coordinate(123L, 432L)
                )
        );

        add(new ParkingSpace(
                        2L,
                        new Address(3972L, "Bad Großpertholz", "Scheiben"),
                        new Coordinate(567L, 543L)
                )
        );
    }};

    public List<ParkingSpace> getAllParkingSpaces() {
        return this.DUMMY_PARKING_SPACES;
    }

    public ParkingSpace getParkingSpace(Long id) {
        if(id == null) throw new IllegalArgumentException("id must not be null");

        Optional<ParkingSpace> ps = this.DUMMY_PARKING_SPACES.stream().filter(p -> p.getId().equals(id)).findFirst();
        if(!ps.isPresent()) throw new NoSuchElementException(String.format("Parking space with id = %d not found!", id));

        return ps.get();
    }

    public ParkingSpace addParkingSpace(ParkingSpace ps) {
        if(ps != null) {
            OptionalInt maxId = DUMMY_PARKING_SPACES.stream().mapToInt(p -> p.getId().intValue()).max();
            maxId.ifPresent(i -> ps.setId(i + 1L));
            DUMMY_PARKING_SPACES.add(ps);
        }

        return ps;
    }
}
