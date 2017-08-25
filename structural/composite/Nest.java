import java.util.ArrayList;
public class Nest extends Node{
  String name;
  ArrayList<Node> nodes;

  public Nest(String name){
    this.name = name;
    this.nodes = new ArrayList<Node>();
  }

  public String getName(){
    return name;
  }

  public int getSize(){
    return this.nodes.stream()
      .map(Node::getSize)
      .reduce(0, Integer::sum);
  }

  public Node add(Node node){
    this.nodes.add(node);
    return this;
  }
}