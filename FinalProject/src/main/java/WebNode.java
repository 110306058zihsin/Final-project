import java.io.IOException;
import java.util.ArrayList;

public class WebNode extends Thread implements Runnable{

 private WebNode parent;
 private ArrayList<WebNode> children;
 private ArrayList<Keyword> keys;
 private WebNode leftChildNode;
 private WebNode rightChildNode;
 private String URL;
 private String title;
 private double score;
 public WebPage webPage;
 
 

 WebNode(WebPage webPage){
  this.webPage = webPage;
  this.children = new ArrayList<WebNode>();
 }
 WebNode(ArrayList<WebNode> nodelist,ArrayList<Keyword> keywords){
  this.children = nodelist;
  this.keys = keywords;
 }
 @Override
 public void run() {
  try {
   setNodeScore(keys);
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
 }
 public void addChild(WebNode child){
  //add the WebNode to its children list
  this.children.add(child);
  child.parent = this;
 }
 public void setNodeScore(ArrayList<Keyword> keywords) throws IOException{
  
  
 
  
  for(WebNode child : children){
   child.webPage.setScore(keywords);
  }
  
    
   
 }
 
 public boolean isTheLastChild(){
  if(this.parent == null) return true;
  ArrayList<WebNode> siblings = this.parent.children;
  
  return this.equals(siblings.get(siblings.size() - 1));
 }
 
 public int getDepth(){
  int retVal = 1; 
  WebNode currNode = this;
  while(currNode.parent!=null){
   retVal ++;
   currNode = currNode.parent;
  }
  return retVal;
 }
 
 
 
 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public double getScore() {
  return score;
 }

 public void setScore(double score) {
  this.score = score;
 }

 public String getURL() {
  return URL;
 }
 public void setURL(String uRL) {
  URL = uRL;
 }
 public WebNode getParent() {
  return parent;
 }
 public void setParent(WebNode parent) {
  this.parent = parent;
 }
 public ArrayList<WebNode> getChildren() {
  return children;
 }
 public void setChildren(ArrayList<WebNode> children) {
  this.children = children;
 }
 public WebNode getLeftChildNode() {
  return leftChildNode;
 }
 public void setLeftChildNode(WebNode leftChildNode) {
  this.leftChildNode = leftChildNode;
 }
 public WebNode getRightChildNode() {
  return rightChildNode;
 }
 public void setRightChildNode(WebNode rightChildNode) {
  this.rightChildNode = rightChildNode;
 }
 
 
 
 
}