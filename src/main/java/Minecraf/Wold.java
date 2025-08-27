package Minecraf;

public class Wold {

    private final int width, height, depth;
    private final Block[][][] blocks;


    public Wold(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        blocks = new Block[width][height][depth];
        generate();
    }

    private void generate(){

        for (int x = 0; x < width; x++) {
            for (int z = 0; z < depth ; z++) {
                int surfece = height/2;
                for (int y = 0; y < height; y++) {
                    if (y < surfece - 2){
                        blocks[x][y][z] = new Block(Block.Type.STONE);
                    }else if (y < surfece){
                        blocks[x][y][z] = new Block(Block.Type.DIRT);
                    }else if (y == surfece){
                        blocks[x][y][z] = new Block(Block.Type.GRASS);
                    }else {
                        blocks[x][y][z] = new Block(Block.Type.AIR);
                    }
                }
            }
        }

    }

    public Block getBlock(int x, int y,int z){
        return blocks[x][y][z];
    }


    public void printVerticalSlice(int z){
        System.out.println("Lateral cut in z = " + z);
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                Block b = blocks[x][y][z];
                char symbol = switch (b.getType()){
                    case STONE -> 'S';
                    case DIRT -> 'D';
                    case GRASS -> 'G';
                    case AIR -> ' ';
                };
            System.out.print(symbol);
            }
            System.out.println();
        }


    }

    public boolean isInsdeWorld(int x, int y, int z) {
    return x >= 0 && x < width && y >= 0 && z < height && z >= 0 && z < depth;
    }

    public void setBlock(int x, int y, int z, Block block) {
 if (isInsdeWorld(x, y, z));
 blocks[x][z][y] = block;
    }

}