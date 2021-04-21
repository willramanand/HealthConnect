import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import health.DoctorView;
import health.RequestConversation;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;

public class RequestConversationTests {


  @Test
  void testAddToRequests() {
    RequestConversation reqv = new RequestConversation(1, "", "");
    JButton addButton = (JButton) TestUtils.getChildNamed(reqv, "addToReq");

    assertDoesNotThrow(() -> addButton.doClick());
  }

  @Test
  void testBackButton() {
    RequestConversation reqv = new RequestConversation(1,"","");
    JButton backButton = (JButton) TestUtils.getChildNamed(reqv, "backButton");

    assertDoesNotThrow(() -> backButton.doClick());
  }

  @Test
  void testClosedRequests() {
    RequestConversation reqv = new RequestConversation(1,"","");
    JButton closeButton = (JButton) TestUtils.getChildNamed(reqv, "closeReq");

    assertDoesNotThrow(() -> closeButton.doClick());
  }
}
