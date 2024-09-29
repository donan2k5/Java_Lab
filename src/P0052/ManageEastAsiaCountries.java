package P0052;

import java.util.ArrayList;
import java.util.Comparator;

public class ManageEastAsiaCountries {
    ArrayList<EastAsiaCountries> list = new ArrayList<>();

    public void inputInformation() {
        GetInput getInput = new GetInput();
        String countryCode = getInput.getString("Enter code of country: ");
        String countryName = getInput.getString("Enter name of country: ");
        float totalArea = getInput.getFloat("Enter total Area: ");
        String countryTerrain = getInput.getString("Enter terrain of country: ");
        list.add(new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain));
    }

    private EastAsiaCountries getRecentlyEnteredInformation() {
        return list.getLast();
    }

    public void printRecentlyEnteredInformation() {
        EastAsiaCountries country = getRecentlyEnteredInformation();
        System.out.printf("%-5s%-10s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
        country.display();
    }

    private EastAsiaCountries searchByName(String name) {
        for (EastAsiaCountries eastAsiaCountries : list) {
            if (eastAsiaCountries.getCountryName().equals(name)) {
                return eastAsiaCountries;
            }
        }
        return null;
    }

    public void displaySearchCountry() {
        GetInput getInput = new GetInput();
        String name = getInput.getString("Enter the name you want to search for: ");
        if (searchByName(name) != null) {
            System.out.printf("%-5s%-10s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
            searchByName(name).display();
        } else {
            System.out.println("NOT FOUND");
        }
    }

    private ArrayList<EastAsiaCountries> getSortInformationByAscendingOrder() {
        ArrayList<EastAsiaCountries> tmp = list;
        tmp.sort(new Comparator<>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return Character.compare(o1.getCountryName().charAt(0), o2.getCountryName().charAt(0));
            }
        });
        return tmp;
    }

    public void sortInformationAscendingOrder() {
        ArrayList<EastAsiaCountries> result = getSortInformationByAscendingOrder();
        System.out.printf("%-5s%-10s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries eastAsiaCountries : result) {
            eastAsiaCountries.display();
        }
    }
}
