package Minecraf;

public class Player {
    private int x, y, z;
    private final Wold wold;

    public int getX(){return x;}
    public int getY(){return y;}
    public int getZ() {return z;}

    public Player(Wold wold, int startX, int startY, int startZ) {
        this.wold = wold;
        this.x = startX;
        this.y = startY;
        this.z = startZ;
    }

    public void move(int dx, int dy, int dz){
        int newY = y + dy;
        int newX = x + dx;
        int newZ = z + dz;

        if (wold.isInsdeWorld(newX, newY, newZ)){
            x = newX;
            y = newY;
            z = newZ;
        System.out.println("You moved to (" + x + ", " + y + ", " + z + ")");
        }else {
            System.out.println("You can't move out of the world");
        }

    }

    public void lookAround(){
        System.out.println("Blocks around you:");
        for (int dy = -1; dy <= 1; dy++) {
            for (int dz = -1; dz <= 1; dz++) {
                for (int dx = -1; dx <= 1; dx++) {
                 int nx = x + dx;
                 int ny = y + dy;
                 int nz = z + dz;

                 if (wold.isInsdeWorld(nx, ny, nz)){
                 Block b = wold.getBlock(nx, ny, nz);
                 System.out.printf("(%d, %d, &d): %s\n", nx, ny, nz, b.getType());
                 }
                }
            }
        }

    }

    public void breakBlock(){
      Block target = wold.getBlock(x, y -1, z);
      if (target.getType() != Block.Type.AIR){
      System.out.println("Broken block");
      } else {
          System.out.println("there's nothing to break");
      }

    }




    public void placeBlock(Block.Type type){
        Block target = wold.getBlock(x, y -1, z );
        if(target.getType() == Block.Type.AIR){
            wold.setBlock(x, y -1, z, new Block(type));
            System.out.println("Block placed");
        }else{
            System.out.println("There is already a block there");
        }

    }




}