package P0052;

public class Main {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        ManageEastAsiaCountries manageEastAsiaCountries = new ManageEastAsiaCountries(getInput);
        while (true) {
            System.out.println("=====Menu=====");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5. Exit");
            int choice = getInput.getInt("Enter your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    manageEastAsiaCountries.inputInformation();
                    break;
                case 2:
                    manageEastAsiaCountries.printRecentlyEnteredInformation();
                    break;
                case 3:
                    manageEastAsiaCountries.displaySearchCountry();
                    break;
                case 4:
                    manageEastAsiaCountries.sortInformationAscendingOrder();
                    break;
                case 5:
                    return;
            }
        }
    }
}
