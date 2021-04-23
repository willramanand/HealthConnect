import health.DoctorView;

import javax.print.Doc;
import javax.swing.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoctorViewTests {

  @Test
  void testDoctorView() {
    DoctorView dv = new DoctorView("testUser");

    assertEquals("testUser", dv.getUsername());
    assertEquals("Doctor", dv.getUserType());
  }

  // tests that the new request button
  @Test
  void testNewRequests() {
    DoctorView dv = new DoctorView("testUser");
    JButton newButton = (JButton) TestUtils.getChildNamed(dv, "newReq");

    assertDoesNotThrow(() -> newButton.doClick());
  }

  // tests for the negative new requests
  @Test
  void negativeTestNewRequests() {
    DoctorView dv = new DoctorView("nottestUser");
    JButton newButton = (JButton) TestUtils.getChildNamed(dv, "newReq");

    assertDoesNotThrow(() -> newButton.doClick());
  }

  // test for the in progress button
  @Test
  void testInProgRequests() {
    DoctorView dv = new DoctorView("testUser");
    JButton inProgButton = (JButton) TestUtils.getChildNamed(dv, "inProg");

    assertDoesNotThrow(() -> inProgButton.doClick());
  }

  // test for the closed button
  @Test
  void testClosedRequests() {
    DoctorView dv = new DoctorView("testUser");
    JButton closedButton = (JButton) TestUtils.getChildNamed(dv, "closedReq");

    assertDoesNotThrow(() -> closedButton.doClick());
  }

  // test for the logout doctor button
  @Test
  void testLogoutDoctor() {
    DoctorView dv = new DoctorView("testUser");
    JButton logoutButton = (JButton) TestUtils.getChildNamed(dv, "logoutDoc");

    assertDoesNotThrow(() -> logoutButton.doClick());
  }


  // test for for branch list value selection.
  @Test
  void otherRequestedListValue(){
    DoctorView dv = new DoctorView("testUser");
    int expResult = -1;

    JList requests = (JList) TestUtils.getChildNamed(dv, "requestList");

    requests.setSelectedIndex(-1);

    assertEquals(expResult, requests.getSelectedIndex());

  }

}
