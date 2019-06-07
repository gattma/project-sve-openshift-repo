package at.fh.sve.ue4.ms.config;

import at.fh.sve.ue4.ms.dao.ParkingDAO;
import at.fh.sve.ue4.ms.domain.Coordinates;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class DatabaseInitializer {
    @Inject
    private Instance<ParkingDAO> parkingDAO;


    private void init(@Observes @Initialized(ApplicationScoped.class) ServletContext context) {
//        [186, 696, 228, 764],
//        [520, 505, 590, 674],
//        [137, 713, 157, 745],
//        [687, 425, 764, 604],
//        [141, 739, 165, 773],
//        [649, 438, 712, 621],
//        [559, 493, 619, 638]

        Integer[] rect  = {186, 696, 228, 764};
        Integer[] rect2 = {520, 505, 590, 674};
        Integer[] rect3 = {137, 713, 157, 745};
        Integer[] rect4 = {687, 425, 764, 604};
        Integer[] rect5 = {141, 739, 165, 773};
        Integer[] rect6 = {649, 438, 712, 621};
        Integer[] rect7 = {559, 493, 619, 638};

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(rect));
        list.add(Arrays.asList(rect2));
        list.add(Arrays.asList(rect3));
        list.add(Arrays.asList(rect4));
        list.add(Arrays.asList(rect5));
        list.add(Arrays.asList(rect6));
        list.add(Arrays.asList(rect7));

        Coordinates coordinates1 = new Coordinates("Hagenberg", list);

        parkingDAO.get().create(coordinates1);
    }
}
