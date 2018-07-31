import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonSaver{
    ObjectMapper _objectMapper;

    public JsonSaver(){
        _objectMapper = new ObjectMapper();
    }

    public static void main(String[] args) {

        String summary = "summary1";
        String priority = "priority";

        Car car = new Car("yellow", "renault");
        Car car1 = new Car("red", "bmw");
        Car car2 = new Car("white", "audi");
        Car car3 = new Car("yellow", "renault");
        List<Car> cars = new ArrayList<Car>() ;
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        JsonSaver saver = new JsonSaver();

        saver.SaveObject("C:\\GitDemos\\car.json", cars);
        Bug b = new Bug("bug1", "test bug", "v1");
        List<Bug> bugs = new ArrayList<Bug>();
        bugs.add(b);
        saver.SaveObject("C:\\GitDemos\\bug.json", bugs);
    }

    public void SaveObject(String fileName, Object objectToSave){
        try {
            _objectMapper.writeValue(new File(fileName), objectToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
