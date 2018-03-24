import java.util.ArrayList;
import java.util.List;

public class CarRepositry {

    static List<Car> carsList = new ArrayList<>();

    public static void showCars() {
        for(Car car : CarRepositry.carsList){
            System.out.println(car.toString());
        }



    }

}
