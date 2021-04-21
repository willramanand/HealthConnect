import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;


import health.PatientView;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;

public class PatientViewTests {

  @Test
  void testDoctorView() {
    PatientView pv = new PatientView("testUser");

    assertEquals("testUser", pv.getUsername());
    assertEquals("Patient", pv.getUserType());
  }

  @Test
  void testNewRequests() {
    PatientView pv = new PatientView("testUser");
    JButton newButton = (JButton) TestUtils.getChildNamed(pv, "newReq");

    assertDoesNotThrow(() -> newButton.doClick());
  }

  @Test
  void testInProgRequests() {
    PatientView pv = new PatientView("testUser");
    JButton inProgButton = (JButton) TestUtils.getChildNamed(pv, "inProg");

    assertDoesNotThrow(() -> inProgButton.doClick());
  }

  @Test
  void testClosedRequests() {
    PatientView pv = new PatientView("testUser");
    JButton closedButton = (JButton) TestUtils.getChildNamed(pv, "closedReq");

    assertDoesNotThrow(() -> closedButton.doClick());
  }

  @Test
  void testBackButton() {
    PatientView pv = new PatientView("testUser");
    JButton backButton = (JButton) TestUtils.getChildNamed(pv, "backBt");

    assertDoesNotThrow(() -> backButton.doClick());
  }

}
