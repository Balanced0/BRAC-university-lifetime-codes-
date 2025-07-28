// NO NEED THIS SUBMIT THIS CLASS
public class WRM {
    Patient dh;

    // The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id, name, age, bloodgroup, null, null);
        newPatient.next = dh;
        newPatient.prev = dh.prev;
        dh.prev.next = newPatient;
        dh.prev = newPatient;
    }

    public void servePatient() {
        // To do
        if (dh.next == dh) {
            return;
        }
        Patient current = dh.next;
        dh.next = dh.next.next;
        dh.next.prev = dh;
        current.next = null;
        current.prev = null;
    }

    public void showAllPatient() {
        // To Do
        if (dh.next == null) {
            return;
        }
        Patient current = dh.next;
        while (current != dh) {
            System.out.println(current.id);
            current = current.next;
        }
    }

    public Boolean canDoctorGoHome() {
        // To Do
        if (dh.next == dh) {
            return true;
        } else {
            return false;
        }
    }

    public void cancelAll() {
        // To Do
        dh.next = dh;
        dh.prev = dh;
    }

    public void reverseTheLine() {
        // To Do
        if (dh.next == dh) {
            return;
        }
        Patient current = dh.next;
        while (current != dh) {
            Patient temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
        Patient temp = dh.next;
        dh.next = dh.prev;
        dh.prev = temp;
    }

}
