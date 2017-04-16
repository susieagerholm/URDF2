import org.xtext.urdf.domainmodel.Robot;
import org.xtext.urdf.domainmodel._;
import scala.collection.JavaConversions._

import java.io.File
import java.io.PrintWriter
import uRDF.URDFModel

package org.xtext.urdf.generator
{
  
  class ScalaGenerator
  {
    
 
    def generateURDF (robot: Robot, filename: String) : String = 
    {
           var test :Map[String,String] = Map();
//           test = test + ("RobotName" -> "R2D2"); 
//           test = test + ("LinkName" -> "Arm");
//           
//           val tt = new XMLGen(test).toXML().toString();
           
           writeToFile("c:\\temp\\"+filename, "dummy");
           return "dummy";
    }

    def writeToFile(p: String, s: String): Unit = {
      val pw = new PrintWriter(new File(p))
      try pw.write(s) finally pw.close()
    }
    
  }

	
}