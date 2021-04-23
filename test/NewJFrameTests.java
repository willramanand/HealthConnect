import health.NewJFrame;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewJFrameTests {

    // test for positive log in for doctor
    @Test
    void loginDoctor() {
        NewJFrame newJFrame = new NewJFrame();
        JTextField username = (JTextField) TestUtils.getChildNamed(newJFrame, "username");
        JPasswordField password = (JPasswordField) TestUtils.getChildNamed(newJFrame, "password");
        JButton logDoc = (JButton) TestUtils.getChildNamed(newJFrame, "docLogin");

        username.setText("testdoctor");
        password.setText("testdoctor");

        assertDoesNotThrow(() -> logDoc.doClick());
    }

    // test for negative log in for doctor
    @Test
    void negativeLoginDoctor() {
        NewJFrame newJFrame = new NewJFrame();
        JTextField username = (JTextField) TestUtils.getChildNamed(newJFrame, "username");
        JPasswordField password = (JPasswordField) TestUtils.getChildNamed(newJFrame, "password");
        JButton logDoc = (JButton) TestUtils.getChildNamed(newJFrame, "docLogin");

        username.setText("nottestdoctor");
        password.setText("nottestdoctor");

        assertDoesNotThrow(() -> logDoc.doClick());
    }

    // test for positive log in for patient
    @Test
    void loginPatient() {
        NewJFrame newJFrame = new NewJFrame();
        JTextField username = (JTextField) TestUtils.getChildNamed(newJFrame, "username");
        JPasswordField password = (JPasswordField) TestUtils.getChildNamed(newJFrame, "password");
        JButton logPat = (JButton) TestUtils.getChildNamed(newJFrame, "patLogin");

        username.setText("testpatient");
        password.setText("testpatient");

        assertDoesNotThrow(() -> logPat.doClick());
    }

    // test for negative log in for patient
    @Test
    void negativeLoginPatientTest() {
        NewJFrame newJFrame = new NewJFrame();
        JTextField username = (JTextField) TestUtils.getChildNamed(newJFrame, "username");
        JPasswordField password = (JPasswordField) TestUtils.getChildNamed(newJFrame, "password");
        JButton logPat = (JButton) TestUtils.getChildNamed(newJFrame, "patLogin");

        username.setText("nottestpatient");
        password.setText("nottestpatient");

        assertDoesNotThrow(() -> logPat.doClick());
    }


    // test for username
    @Test
    void usernameCheck() {
        NewJFrame newJFrame = new NewJFrame();

        newJFrame.setUsername("Testing123");

        assertEquals("Testing123", newJFrame.getUsername());
    }
}
