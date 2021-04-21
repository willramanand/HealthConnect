import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import health.DoctorView;
import health.Profile;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;

public class ProfileTests {

  @Test
  void testNewProfileRequests() {
    Profile pr = new Profile("testUser");
    JButton newButton = (JButton) TestUtils.getChildNamed(pr, "makeReq");

    assertDoesNotThrow(() -> newButton.doClick());
  }

  @Test
  void testViewProfileRequests() {
    Profile pr = new Profile("testUser");
    JButton closedButton = (JButton) TestUtils.getChildNamed(pr, "viewReq");

    assertDoesNotThrow(() -> closedButton.doClick());
  }

  @Test
  void testLogoutProfile() {
    Profile pr = new Profile("testUser");
    JButton logoutButton = (JButton) TestUtils.getChildNamed(pr, "logoutProfile");

    assertDoesNotThrow(() -> logoutButton.doClick());
  }
}
