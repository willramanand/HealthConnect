import health.NewRequests;
import javax.swing.JButton;
import javax.swing.JTextArea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewRequestsTests {

  @Test
  void successCreate() {
    NewRequests nr = new NewRequests("Bob_Guy");
    JTextArea reqInfo = (JTextArea) TestUtils.getChildNamed(nr, "insertReq");
    JButton createButton = (JButton) TestUtils.getChildNamed(nr, "create");

    reqInfo.setText("Testing, Testing, Testing");
    assertDoesNotThrow(() -> createButton.doClick());
  }

  @Test
  void successCancel() {
    NewRequests nr = new NewRequests("Bob_Guy");
    JButton cancelButton = (JButton) TestUtils.getChildNamed(nr, "cancel");

    assertDoesNotThrow(() -> cancelButton.doClick());
  }

}
