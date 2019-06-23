package com.zipcodewilmington.froilansfarm.Pojo;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import java.util.HashMap;
import java.util.Map;


public class Storage {

        private static Storage INSTANCE;
        private String key;
        private Map<String, Integer> conatiner;


        public static Storage getInstance (){
            if(INSTANCE == null){
                INSTANCE = new Storage();
            }
            return INSTANCE;
        }

        private Storage(){
            this.conatiner = new HashMap<>();
            this.conatiner.put("egg", 500);
            this.conatiner.put("corn", 500);
            this.conatiner.put("tomato", 500);

        }

    public void addEdible(Edible edible) {
        setKey(edible);
        conatiner.replace(key, conatiner.get(key) + 1 );
    }

    public void removeEdible(Edible edible) {
       setKey(edible);
       conatiner.replace(key, conatiner.get(key) - 1 );
    }



   public Integer count(Edible edible) {
        setKey(edible);
        return this.conatiner.get(key);
    }

    private void setKey(Edible edible) {
        if (edible instanceof EdibleEgg) {
            this.key = "egg";
        } else if (edible instanceof EarOfCorn) {
            this.key = "corn";
        } else if (edible instanceof Tomato) {
            this.key ="tomato";
        }
    }

    public void resetConainter() {
        conatiner.replace("egg",0);
        conatiner.replace("corn",0);
        conatiner.replace("tomato",0);
    }
}
