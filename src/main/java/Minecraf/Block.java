package Minecraf;

public class Block {
 public enum  Type{
 AIR, DIRT, GRASS, STONE;
 }

 private final Type type;

 public Block(Type type){
     this.type = type;
 }

 public Type getType(){
     return type;
 }

 public boolean isSolid(){
     return type != Type.AIR;
 }

 @Override
    public String toString(){
     return type.name();
 }


}

