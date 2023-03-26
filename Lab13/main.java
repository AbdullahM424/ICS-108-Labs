package Lab13;

public class main {
    public static void main(String[] args){
        City[] cities= new City[3];

        cities[0]= new City("Dammam", 46);
        cities[1]= new City("Riyadh", 34);
        cities[2]= new City("Abha", 20);

        for( City element: cities){
            System.out.println(element.toString());
        }
        try {
            System.out.println(cities[2].clone());
        }
        catch (CloneNotSupportedException exp){
            System.out.println(exp.getMessage());
        }
    }





}
