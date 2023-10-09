import java.util.Scanner;
import java.io.File;
public class AnytownTest {
    public static void main(String[] args) throws Exception {

        Building[] buildings = new Building[11];
        File fileIn = new File("src/building.txt");
        Scanner fileInput = new Scanner(fileIn);
        String buildingData;
        int marker1 = 2, marker2, marker3, marker4, marker5;
        String address, owner;
        int numberofBedrooms, numberofEmployees, avgTurnover;
        boolean hasGarage;
        int thisBuilding = 0;

        while (fileInput.hasNextLine()) {
            buildingData = fileInput.nextLine();
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            address = buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2+ 1, marker3);

            switch(buildingData.substring(0, 1)){
                case "B" :
                    // create new building
                    System.out.println("Building");
                    buildings[thisBuilding] = new Building(address, owner);
                    thisBuilding++;
                    break;
                case "H" :
                    // create new house
                    System.out.println("House");
                    numberofBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                    hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5));
                    buildings[thisBuilding] = new House(address, owner, numberofBedrooms, hasGarage);
                    thisBuilding++;
                    break;
                case "S" :
                    // create new shop
                    System.out.println("Shop");
                    numberofEmployees =Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                    avgTurnover = Integer.parseInt(buildingData.substring(marker4 + 1, marker5));
                    buildings[thisBuilding] = new Shop(address, owner, numberofEmployees, avgTurnover);
                    thisBuilding++;
                    break;
                }

            }
        for (Building building : buildings){
            System.out.println(building);
        }
    }
}
