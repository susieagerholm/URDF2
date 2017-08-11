package org.xtext.urdf.generator;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFFactory;
import org.xtext.urdf.myURDF.Topology;
import org.xtext.urdf.myURDF.impl.MyURDFFactoryImpl;

public class GraphViz
{
   /**
    * The dir. where temporary files will be created.
    */
 //  private static String TEMP_DIR = "/tmp";	// Linux
   public static String TEMP_DIR = "c:\\temp";	// Windows

   /**
    * Where is your dot program located? It will be called externally.
    */
//   private static String DOT = "/usr/local/bin/dot";	// Linux
   private static String DOT = "C:\\graphviz\\bin\\dot.exe";	// Windows

   /**
    * The source of the graph written in dot language.
    */
	private StringBuilder graph = new StringBuilder();

   /**
    * Constructor: creates a new GraphViz object that will contain
    * a graph.
    */
   public GraphViz() {
   }

   /**
    * Returns the graph's source description in dot language.
    * @return Source of the graph in dot language.
    */
   public String getDotSource() {
      return graph.toString();
   }

   /**
    * Adds a string to the graph's source (without newline).
    */
   public void add(String line) {
      graph.append(line);
   }

   /**
    * Adds a string to the graph's source (with newline).
    */
   public void addln(String line) {
      graph.append(line + "\n");
   }

   /**
    * Adds a newline to the graph's source.
    */
   public void addln() {
      graph.append('\n');
   }

   /**
    * Returns the graph as an image in binary format.
    * @param dot_source Source of the graph to be drawn.
    * @param type Type of the output image to be produced, e.g.: gif, dot, fig, pdf, ps, svg, png.
    * @return A byte array containing the image of the graph.
    */
   public byte[] getGraph(String dot_source, String type)
   {
      File dot;
      byte[] img_stream = null;
   
      try {
         dot = writeDotSourceToFile(dot_source);
         if (dot != null)
         {
            img_stream = get_img_stream(dot, type);
            if (dot.delete() == false) 
               System.err.println("Warning: " + dot.getAbsolutePath() + " could not be deleted!");
            return img_stream;
         }
         return null;
      } catch (java.io.IOException ioe) { return null; }
   }

   /**
    * Writes the graph's image in a file.
    * @param img   A byte array containing the image of the graph.
    * @param file  Name of the file to where we want to write.
    * @return Success: 1, Failure: -1
    */
   public int writeGraphToFile(byte[] img, String file)
   {
      File to = new File(file);
      return writeGraphToFile(img, to);
   }

   /**
    * Writes the graph's image in a file.
    * @param img   A byte array containing the image of the graph.
    * @param to    A File object to where we want to write.
    * @return Success: 1, Failure: -1
    */
   public int writeGraphToFile(byte[] img, File to)
   {
      try {
         FileOutputStream fos = new FileOutputStream(to);
         fos.write(img);
         fos.close();
      } catch (java.io.IOException ioe) { return -1; }
      return 1;
   }

   /**
    * It will call the external dot program, and return the image in
    * binary format.
    * @param dot Source of the graph (in dot language).
    * @param type Type of the output image to be produced, e.g.: gif, dot, fig, pdf, ps, svg, png.
    * @return The image of the graph in .gif format.
    */
   private byte[] get_img_stream(File dot, String type)
   {
      File img;
      byte[] img_stream = null;

      try {
         img = File.createTempFile("graph_", "."+type, new File(GraphViz.TEMP_DIR));
         Runtime rt = Runtime.getRuntime();
         
         // patch by Mike Chenault
         String[] args = {DOT, "-T"+type, dot.getAbsolutePath(), "-o", img.getAbsolutePath()};
         Process p = rt.exec(args);
         
         p.waitFor();

         FileInputStream in = new FileInputStream(img.getAbsolutePath());
         img_stream = new byte[in.available()];
         in.read(img_stream);
         // Close it if we need to
         if( in != null ) in.close();

         if (img.delete() == false) 
            System.err.println("Warning: " + img.getAbsolutePath() + " could not be deleted!");
      }
      catch (java.io.IOException ioe) {
         System.err.println("Error:    in I/O processing of tempfile in dir " + GraphViz.TEMP_DIR+"\n");
         System.err.println("       or in calling external command");
         ioe.printStackTrace();
      }
      catch (java.lang.InterruptedException ie) {
         System.err.println("Error: the execution of the external program was interrupted");
         ie.printStackTrace();
      }

      return img_stream;
   }

   /**
    * Writes the source of the graph in a file, and returns the written file
    * as a File object.
    * @param str Source of the graph (in dot language).
    * @return The file (as a File object) that contains the source of the graph.
    */
   private File writeDotSourceToFile(String str) throws java.io.IOException
   {
      File temp;
      try {
         temp = File.createTempFile("graph_", ".dot.tmp", new File(GraphViz.TEMP_DIR));
         FileWriter fout = new FileWriter(temp);
         fout.write(str);
         fout.close();
      }
      catch (Exception e) {
         System.err.println("Error: I/O error while writing the dot source to temp file!");
         return null;
      }
      return temp;
   }

   /**
    * Returns a string that is used to start a graph.
    * @return A string to open a graph.
    */
   public String start_graph() {
      return "digraph G {";
   }

   /**
    * Returns a string that is used to end a graph.
    * @return A string to close a graph.
    */
   public String end_graph() {
      return "}";
   }

   /**
    * Read a DOT graph from a text file.
    * 
    * @param input Input text file containing the DOT graph
    * source.
    */
   public void readSource(String input)
   {
	   StringBuilder sb = new StringBuilder();
	   
	   try
	   {
		   FileInputStream fis = new FileInputStream(input);
		   DataInputStream dis = new DataInputStream(fis);
		   BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		   String line;
		   while ((line = br.readLine()) != null) {
			   sb.append(line);
		   }
		   dis.close();
	   } 
	   catch (Exception e) {
		   System.err.println("Error: " + e.getMessage());
	   }
	   
	   this.graph = sb;
   }
   
   public static void main2(String[] args) {
	   //Example
      GraphViz gv = new GraphViz();
      gv.addln(gv.start_graph());
      gv.addln("A -> B;");
      gv.addln("A -> C;");
      gv.addln(gv.end_graph());
      System.out.println(gv.getDotSource());
	   
      String type = "gif";
      File out = new File(TEMP_DIR + "\\graphTest." + type);   // out.gif in this example
      gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
	   
   }
   
   public int getLastJointNumber() {
	   String source = getDotSource();
	   int i = 1;
	   while (source.indexOf("Joint"+i)>-1) {
		   i++;
	   }
	   return i;
   }
   
   
 @SuppressWarnings("unused")
private static ArrayList<Topology> testdata() {
	   ArrayList<Topology> list = new ArrayList<Topology>();
	   
	   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
	   Topology topo = eINSTANCE.createTopology();
	   Topology child = eINSTANCE.createTopology();

	   Link l2 = eINSTANCE.createLink();
	   l2.setName("l2");
	   child.setParent(l2);

	   topo.setChild(child);
	   Link l1 = eINSTANCE.createLink();
	   l1.setName("l1");
	   topo.setParent(l1);

	   Topology topo2 = eINSTANCE.createTopology();
	   Topology child2 = eINSTANCE.createTopology();

	   Link l4 = eINSTANCE.createLink();
	   l4.setName("l4");
	   child2.setParent(l4);

	   topo2.setChild(child2);
	   Link l3 = eINSTANCE.createLink();
	   l3.setName("l3");
	   topo2.setParent(l3);
	   list.add(topo);
	   list.add(topo2);
	   return list;

   }
   
   
} // end of class GraphViz
