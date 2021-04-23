import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import health.DoctorView;
import health.Profile;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;

public class ProfileTests {

  // test for new profile creation request
  @Test
  void testNewProfileRequests() {
    Profile pr = new Profile("testUser");
    JButton newButton = (JButton) TestUtils.getChildNamed(pr, "makeReq");

    assertDoesNotThrow(() -> newButton.doClick());
  }

  // test for view profile button request
  @Test
  void testViewProfileRequests() {
    Profile pr = new Profile("testUser");
    JButton closedButton = (JButton) TestUtils.getChildNamed(pr, "viewReq");

    assertDoesNotThrow(() -> closedButton.doClick());
  }

  // test logout button request
  @Test
  void testLogoutProfile() {
    Profile pr = new Profile("testUser");
    JButton logoutButton = (JButton) TestUtils.getChildNamed(pr, "logoutProfile");

    assertDoesNotThrow(() -> logoutButton.doClick());
  }
}
