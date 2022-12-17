import java.io.IOException;
import java.util.ArrayList;




public class WebTree {
 public WebNode root;
 private ArrayList<WebNode> console = new ArrayList<WebNode>();
 public WebTree(WebPage rootPage){
  this.root = new WebNode(rootPage);
 }
 
 public void setPostOrderScore(ArrayList<Keyword> keywords) throws IOException{
  
  try {
   setPostOrderScoreThread(root, keywords);
  } catch (IOException | InterruptedException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
 }
 
 public ArrayList<WebNode> getConsole() {
  return console;
 }

 public void setConsole(ArrayList<WebNode> console) {
  this.console = console;
 }

 
 private void setPostOrderScoreThread(WebNode startNode, ArrayList<Keyword> keywords) throws IOException, InterruptedException{
  ArrayList<WebNode> A = new ArrayList<WebNode>();
  ArrayList<WebNode> B = new ArrayList<WebNode>();
  ArrayList<WebNode> C = new ArrayList<WebNode>();
  
  for(int i=0;i<startNode.getChildren().size();i++) {
   if(i<=startNode.getChildren().size()/3) {
    A.add(startNode.getChildren().get(i));
   }
   else if(i>startNode.getChildren().size()/3&i<=startNode.getChildren().size()*2/3){
	    B.add(startNode.getChildren().get(i));
	   }
   else if(i>startNode.getChildren().size()*2/3){
    C.add(startNode.getChildren().get(i));
   }  
  }
  WebNode nodeA = new WebNode(A,keywords);
  WebNode nodeB = new WebNode(B,keywords);
  WebNode nodeC = new WebNode(C,keywords);
  Thread threadA = new Thread(nodeA);
  Thread threadB = new Thread(nodeB);
  Thread threadC = new Thread(nodeC);
  threadA.start();
  threadB.start();
  threadC.start();
  threadA.join();
  threadB.join();
  threadC.join();
  console.addAll(nodeA.getChildren());
  console.addAll(nodeB.getChildren());
  console.addAll(nodeC.getChildren());
  }
 
 public void eularPrintTree(){
  eularPrintTree(root);
 }
 
 private void eularPrintTree(WebNode startNode){
  System.out.println("finished");
  quickSort1(0, console.size()-1);
  
  for(WebNode node:console) {
   System.out.println(node.webPage.title+"|"+node.webPage.getScore());//我把webPage的name改成title了
  }
  
  
 }

 public void swap1(int aIndex, int bIndex){
  WebNode temp = console.get(aIndex);
  console.set(aIndex, console.get(bIndex));
  console.set(bIndex, temp);
 }
   private void quickSort1(int left, int right) {
         if(left < right) { 
             int q = partition1(left, right); 
             quickSort1( left, q-1); 
             quickSort1( q+1, right); 
         } 

     }

     private int partition1( int left, int right) {  
         int i = left - 1; 
         for(int j = left; j < right; j++) { 
             if(console.get(j).webPage.getScore() >= console.get(right).webPage.getScore()) { 
                 i++; 
                 swap1(i, j); 
             } 
         } 
         swap1(i+1, right); 
         return i+1; 
     } 
 
}