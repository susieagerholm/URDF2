/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.tests.suite;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.urdf.myURDF.Joint;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.impl.RobotImpl;
import org.xtext.urdf.tests.DslInjectorProvider;
import org.xtext.urdf.tests.TestAdapter;

@RunWith(XtextRunner.class)
@InjectWith(DslInjectorProvider.class)
@SuppressWarnings("all")
public class DslParsingTest {
  @Inject
  @Extension
  private ParseHelper<Robot> _parseHelper;
  
  /**
   * Are elements created as expected by their respective default constructor in grammar
   * Are elements created as expected by Topology and iDerivedStateComputer
   * Are elements based on Reuse created as expected
   * Are Decorations created as expected
   */
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Robot robo Link link1");
      _builder.newLine();
      final Robot result = this._parseHelper.parse(_builder);
      EList<Link> _links = result.getLinks();
      Assert.assertNotNull(_links);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void createLink() {
    final RobotImpl rob = TestAdapter.createTestUrdf();
    EList<Link> _links = rob.getLinks();
    final Link myLink = _links.get(0);
    String _name = myLink.getName();
    Assert.assertEquals("URDFLink1Testname", _name);
  }
  
  @Test
  public void createJoint() {
    final RobotImpl roboto = TestAdapter.createTestUrdf();
    EList<Joint> _joint = roboto.getJoint();
    final Joint myJoint = _joint.get(0);
    String _name = myJoint.getName();
    Assert.assertEquals("Joint1", _name);
    Link _parentOf = myJoint.getParentOf();
    String _name_1 = _parentOf.getName();
    Assert.assertEquals("URDF2", _name_1);
    Link _childOf = myJoint.getChildOf();
    String _name_2 = _childOf.getName();
    Assert.assertEquals("URDFLink1Testname", _name_2);
  }
}
