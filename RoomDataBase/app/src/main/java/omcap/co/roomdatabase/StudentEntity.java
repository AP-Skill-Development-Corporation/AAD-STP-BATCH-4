package omcap.co.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "studentEntity")
public class StudentEntity {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name,email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
