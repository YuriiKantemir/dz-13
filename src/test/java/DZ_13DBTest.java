import org.example.automation.Config;
import org.example.automation.Session;
import org.example.automation.base.BaseTestNG;
import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DZ_13DBTest extends BaseTestNG {
    // UPDATE, DELETE

    @Test(testName = "DataBaseSELECTTest")
    public void testSelect() {
        try {
            PreparedStatement statement = Session.get().mysql().preparedStatement("SELECT * FROM homework_user_data WHERE id=?;");
            statement.setInt(1, 1);
            ResultSet resultSet = statement.executeQuery();
            System.out.println(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(testName = "DataBaseINSERTTest")
    public void testInsert() {
        try {
            PreparedStatement statement = Session.get().mysql().preparedStatement("INSERT INTO homework_user_data (first_name,last_name) VALUES (?,?);");
            statement.setString(1, "Billy");
            statement.setString(2, "Harrington");
            int resultSet = statement.executeUpdate();
            System.out.println(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @Test(testName = "DataBaseUpdateTest")
    public void testUpdate () {
        try {
            PreparedStatement statement = Session.get().mysql().preparedStatement("UPDATE homework_user_data SET login =?, password_hash =? WHERE id = ?;");
            statement.setString(1, "billyh");
            statement.setString(2, "827ccb0eea8a706c4c34a16891f84e7b");
            statement.setInt(3, 4);
            int resultSet = statement.executeUpdate();
            System.out.println(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test(testName = "DataBaseDeleteTest")
    public void testDelete () {
        try {
            PreparedStatement statement = Session.get().mysql().preparedStatement("DELETE FROM homework_user_data WHERE id = ?;");
            //statement.setString(1, "billyh");
            //statement.setString(2, "827ccb0eea8a706c4c34a16891f84e7b");
            statement.setInt(1, 4);
            int resultSet = statement.executeUpdate();
            System.out.println(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
