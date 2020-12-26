package at.ac.campuswien.fh.foodsy.foodsy_backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="USER")
public class User implements Serializable {

    private static final long serialVersionUID = 2214488851494822078L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name="USER_UUID")
    private String userUUID;
    @Column(name="USERNAME")
    private String username;
    @Column(name="FIRSTNAME")
    private String firstname;
    @Column(name="SURNAME")
    private String surname;
    @Column(name="PASSWORD")
    private String password;

    public User() {}

    public User(String userUUID, String username, String firstname, String surname, String password) {
        this.userUUID = userUUID;
        this.username = username;
        this.firstname = firstname;
        this.surname = surname;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getUserUUID() {
        return userUUID;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public void setId(long id) {
        this.id = id;
    }
}
