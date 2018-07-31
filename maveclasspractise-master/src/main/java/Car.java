import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Car {

    public Car (String color, String type){
        this.color = color;
        this.type = type;
    }
    private String color;
    private String type;

    public String getColor(){
        return this.color;
    }

    public String getType(){
        return this.type;
    }
    // standard getters setters
}