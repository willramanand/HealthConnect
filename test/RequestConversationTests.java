import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import health.DoctorView;
import health.RequestConversation;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;

public class RequestConversationTests {


  // test adding request to button
  @Test
  void testAddToRequests() {
    RequestConversation reqv = new RequestConversation(1, "", "");
    JButton addButton = (JButton) TestUtils.getChildNamed(reqv, "addToReq");

    assertDoesNotThrow(() -> addButton.doClick());
  }

  // test back button
  @Test
  void testBackButton() {
    RequestConversation reqv = new RequestConversation(1,"","");
    JButton backButton = (JButton) TestUtils.getChildNamed(reqv, "backButton");

    assertDoesNotThrow(() -> backButton.doClick());
  }

  // test closed request button
  @Test
  void testClosedRequests() {
    RequestConversation reqv = new RequestConversation(1,"","");
    JButton closeButton = (JButton) TestUtils.getChildNamed(reqv, "closeReq");

    assertDoesNotThrow(() -> closeButton.doClick());
  }

  // test doctor add request button
  @Test
  void testDocAddToRequests() {
    RequestConversation reqv = new RequestConversation(1, "", "Doctor");
    JButton addButton = (JButton) TestUtils.getChildNamed(reqv, "addToReq");

    assertDoesNotThrow(() -> addButton.doClick());
  }

  // test doctor back button
  @Test
  void testDocBackButton() {
    RequestConversation reqv = new RequestConversation(1,"","Doctor");
    JButton backButton = (JButton) TestUtils.getChildNamed(reqv, "backButton");

    assertDoesNotThrow(() -> backButton.doClick());
  }

  // test doctor close button.
  @Test
  void testDocClosedRequests() {
    RequestConversation reqv = new RequestConversation(1,"","Doctor");
    JButton closeButton = (JButton) TestUtils.getChildNamed(reqv, "closeReq");

    assertDoesNotThrow(() -> closeButton.doClick());
  }
}
