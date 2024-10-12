package P0055;

import java.util.HashMap;
import java.util.TreeMap;

public class DoctorManagement {
    private final DoctorDAO doctorDAO = new DoctorDAO();
    public GetInput getInput;

    public DoctorManagement(GetInput getInput) {
        this.getInput = getInput;
    }

    public void addDoctor() {
        String code = "";
        while (true) {
            code = getInput.getStringCode("Enter Code: ");
            if(!doctorDAO.getMap().containsKey(code)) {
                break;
            }
            System.out.println("CODE IS EXIST, PLEASE ENTER AGAIN");
        }

        String name = getInput.getStringNotBlank("Enter Name: ");
        String specialization = getInput.getStringNotBlank("Enter Specialization: ");
        int availability = getInput.getInt("Enter Availability: ");

        Doctor doctor = new Doctor(code, name, specialization, availability);
        doctorDAO.addDoctor(doctor);
        System.out.println("SUCCESSFUL");
    }

    public void updateDoctor() {
        String code = getInput.getStringCode("Enter Code: ");
        if(doctorDAO.getMap().containsKey(code)) {
            String name = getInput.getStringNotBlank("Enter Name: ");
            String specialization = getInput.getStringNotBlank("Enter Specialization: ");
            int availability = getInput.getInt("Enter availability: ");
            Doctor doctor = new Doctor(code, name, specialization, availability);
            doctorDAO.updateDoctor(doctor);
            System.out.println("UPDATE SUCCESSFUL");
        }
        else{
            System.out.println("NOT FOUND DOCTOR TO UPDATE");
        }
    }

    public void deleteDoctor() {
        String code = getInput.getStringNotBlank("Enter Code: ");
        if(doctorDAO.getMap().containsKey(code)) {
            doctorDAO.deleteDoctor(code);
            System.out.println("DELETE SUCCESSFUL");
        }else {
            System.out.println("NOT FOUND DOCTOR TO DELETE");
        }

    }

    public void searchDoctor(){
        String text = getInput.getString("Enter text: ");
        if(doctorDAO.getMap().isEmpty()) {
            System.out.println("NOT FOUND");
        }else{
            if(text.isBlank()) {
                displayListDoctor(doctorDAO.getMap());
            }
            else {
                TreeMap<String, Doctor> map = doctorDAO.searchDoctor(text);
                if(map.isEmpty()) {
                    System.out.println("NOT FOUND");
                }
                else {
                    displayListDoctor(map);
                }
            }
        }
    }

    private void displayListDoctor(TreeMap<String, Doctor> map) {
        System.out.println("-----Result-----");
        System.out.printf("%-10s%-10s%-20s%-15s\n", "Code", "Name", "Specialization", "Availability");
        for (Doctor doctor : map.values()) {
            System.out.printf("%-10s%-10s%-20s%-15s\n",doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability());
        }
    }
}
