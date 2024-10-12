package P0055;


public class Main {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        DoctorManagement doctorManagement = new DoctorManagement(getInput);
        while (true) {
            System.out.println("=====DOCTOR MANAGEMENT=====");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Exit");
            int choice = getInput.getIntChoice("Enter your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    doctorManagement.addDoctor();
                    break;
                case 2:
                    doctorManagement.updateDoctor();
                    break;
                case 3:
                    doctorManagement.deleteDoctor();
                    break;
                case 4:
                    doctorManagement.searchDoctor();
                    break;
                case 5:
                    return;
            }
        }
    }
}
