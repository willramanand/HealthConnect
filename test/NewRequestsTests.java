import health.NewRequests;
import javax.swing.JButton;
import javax.swing.JTextArea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewRequestsTests {

  // test for successful creation of request
  @Test
  void successCreate() {
    NewRequests nr = new NewRequests("Bob_Guy");
    JTextArea reqInfo = (JTextArea) TestUtils.getChildNamed(nr, "insertReq");
    JButton createButton = (JButton) TestUtils.getChildNamed(nr, "create");

    reqInfo.setText("Testing, Testing, Testing");
    assertDoesNotThrow(() -> createButton.doClick());
  }

  // test for successful cancel request
  @Test
  void successCancel() {
    NewRequests nr = new NewRequests("Bob_Guy");
    JButton cancelButton = (JButton) TestUtils.getChildNamed(nr, "cancel");

    assertDoesNotThrow(() -> cancelButton.doClick());
  }

}
