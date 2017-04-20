

package org.xtext.urdf.generator {

import uRDF.Robot


class XMLGen() {

    // robot.getLink.get(0).     name???
  
    def toXML(robot: Robot) = <robot><link name={"dummy"}></link></robot>;
  
}


}

