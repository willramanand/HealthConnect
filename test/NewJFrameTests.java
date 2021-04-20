import health.NewJFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewJFrameTests {

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

  @Test
  void usernameCheck() {
    NewJFrame newJFrame = new NewJFrame();

    newJFrame.setUsername("Testing123");

    assertEquals("Testing123", newJFrame.getUsername());
  }
}
