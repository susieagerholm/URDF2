import java.io.File
import java.io.PrintWriter


import org.xtext.urdf.generator.XMLGen
import uRDF.Robot

package org.xtext.urdf.generator
{
  
  class ScalaGenerator
  {
    
 
    def generateURDF (robot: Robot, filename: String) : String = 
    {
           val urdf = new XMLGen().toXML(robot).toString();
           
           writeToFile("c:\\temp\\"+filename, urdf);
           return "";
    }

    def writeToFile(p: String, s: String): Unit = {
      val pw = new PrintWriter(new File(p))
      try pw.write(s) finally pw.close()
    }
    
  }

	
}