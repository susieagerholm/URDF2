import org.xtext.urdf.domainmodel.Robot

package org.xtext.urdf.generator {


class XMLGen() {

    // robot.getLink.get(0).     name???
  
    def toXML(robot: Robot) = <robot><link name={"dummy"}></link></robot>;
  
}


}

