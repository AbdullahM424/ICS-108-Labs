package Lab13;

public class City implements Comparable<City>, Cloneable {
    private String cityName;
    private int temperature;

    public City(String cityName, int temperature){
        this.cityName= cityName;
        this.temperature= temperature;
    }
    public  int compareTo(City city){
        if(city instanceof City){
            if(temperature>   city.temperature){
                return 1;
            }
            else if( temperature<  city.temperature){
                return -1;
            }
            else{
                return 0;
            }

            }
        else{
            return -2;
        }
    }

    @Override
    public String toString(){
        return "City:  "+ cityName+ "  Temperature:  " + temperature;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

