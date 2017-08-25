public class Item extends Node{
  String name;
  int size;

  public Item(String name, int size){
    this.name = name;
    this.size = size;
  }
  public String getName(){
    return this.name;
  }
  public int getSize(){
    return this.size;
  }
}