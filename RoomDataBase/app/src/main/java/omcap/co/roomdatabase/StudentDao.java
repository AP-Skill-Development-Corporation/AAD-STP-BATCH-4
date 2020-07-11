package omcap.co.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    void InsetData(StudentEntity studentEntity);
    @Query("select * from studentEntity")
    List<StudentEntity> getAll();
}
