package se.lexicon;

public class newArray {
    public static void main(String[] args) {
        // strig [] cars = " Volvo 740","saab 900"," audi 54", "Tesla model 3");
        String[] cars = new String[4];
        cars[0] = " volvo 740";
        cars[1] = "saab 900";
        cars[2] = "Audi 54";
        cars[3] = "Tesla Model 3";
        System.out.println(" Hello GitHup");
        System.out.println(" Here is my first update to my repo");
        System.out.println(cars[3]);
        System.out.println("........ car list...........");
        /* for (int i=0 ;i <cars.length; i++){
            System.out.println(cars[i]);
            }*/
        for (String aCar : cars) {

            System.out.println(aCar);

        }

        // End of main
        // End of array
    }


}
