
import scala.collection.JavaConversions._
import uRDF.Robot
import uRDF.Link
import uRDF.URDFPackage
import org.eclipse.emf.ecore.EReference

package org.xtext.urdf.validation
{

  class Constraints {
    
    def urdfComplete (robot :Robot) :(Boolean,String,EReference) = {
      var temp = robot.getJoint.iterator.toList.forall { j => j.getParentOf != j.getChildOf }
      (temp,"Joint error",URDFPackage.Literals.ROBOT__JOINT)
    }
    
    
    //Name required on all links
 //   def urdfValid (robot: Robot) :Boolean = robot.getLink.iterator.toList.forall { l => l.getName != null }
    
    def urdfV(links: List[Link]) :Iterable[String] = {
      findDuplicates(links) {link=>link.getName}
    }
    
    def findDuplicates[A,B](list:List[B])(crit:(B)=>A):Iterable[A] = {
     list.groupBy(crit) filter {case (_,l) => l.size > 1 } keys 
}
    
        
 }
}