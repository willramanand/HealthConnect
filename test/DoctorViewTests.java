import health.DoctorView;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoctorViewTests {

  @Test
  void testDoctorView() {
    DoctorView dv = new DoctorView("testUser");

    assertEquals("testUser", dv.getUsername());
    assertEquals("Doctor", dv.getUserType());
  }

  @Test
  void testNewRequests() {
    DoctorView dv = new DoctorView("testUser");
    JButton newButton = (JButton) TestUtils.getChildNamed(dv, "newReq");

    assertDoesNotThrow(() -> newButton.doClick());
  }

  @Test
  void negativeTestNewRequests() {
    DoctorView dv = new DoctorView("nottestUser");
    JButton newButton = (JButton) TestUtils.getChildNamed(dv, "newReq");

    assertDoesNotThrow(() -> newButton.doClick());
  }

  @Test
  void testInProgRequests() {
    DoctorView dv = new DoctorView("testUser");
    JButton inProgButton = (JButton) TestUtils.getChildNamed(dv, "inProg");

    assertDoesNotThrow(() -> inProgButton.doClick());
  }

  @Test
  void testClosedRequests() {
    DoctorView dv = new DoctorView("testUser");
    JButton closedButton = (JButton) TestUtils.getChildNamed(dv, "closedReq");

    assertDoesNotThrow(() -> closedButton.doClick());
  }

  @Test
  void testLogoutDoctor() {
    DoctorView dv = new DoctorView("testUser");
    JButton logoutButton = (JButton) TestUtils.getChildNamed(dv, "logoutDoc");

    assertDoesNotThrow(() -> logoutButton.doClick());
  }
}
