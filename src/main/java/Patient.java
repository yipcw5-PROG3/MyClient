import java.io.Serializable;

public class Patient implements Serializable {
    private String name;
    private int id;
    private int phoneNo;

    public Patient(String name, int id, int phoneNumber){ // The constructor
        this.name=name; // Initialize fields
        this.id=id;
        phoneNo=phoneNumber;
    }
}