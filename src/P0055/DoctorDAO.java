package P0055;

import java.util.TreeMap;

public class DoctorDAO {
    private TreeMap<String, Doctor> map = new TreeMap<>();

    public DoctorDAO(TreeMap<String, Doctor> map) {
        this.map = map;
    }

    public void addDoctor(Doctor doctor){
        map.put(doctor.getCode(), doctor);
    }

    public void updateDoctor(Doctor doctor) {
        map.put(doctor.getCode(), doctor);
    }

    public void deleteDoctor(String code) {
        map.remove(code);
    }

    public TreeMap<String, Doctor> searchDoctor(String text) {
        TreeMap <String, Doctor> tmpMap = new TreeMap<>();
        for (Doctor doctor : map.values()) {
            if(doctor.getName().equals(text) || doctor.getSpecialization().equals(text)) {
                tmpMap.put(doctor.getCode(), doctor);
            }
        }
        return tmpMap;
    }

    public TreeMap<String, Doctor> getMap() {
        return map;
    }
}
