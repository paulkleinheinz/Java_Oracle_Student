package Section6;

public class LoopShape {

    public static void createRectangle(int width, int height) {
        if (width < 1 || height < 1) {
            System.out.println("Error: Dimensions must be at least 1.");
            return;
        }

        for (int row = 0; row < height; row++) {
            if (row == 0 || row == height - 1) {
                // top and bottom border: full row of #
                for (int col = 0; col < width; col++) {
                    System.out.print("#");
                }
            } else {
                // middle rows: # on edges, spaces inside
                System.out.print("#");
                for (int col = 1; col < width - 1; col++) {
                    System.out.print(" ");
                }
                if (width > 1) System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int size) {
        if (size < 1) {
            System.out.println("Error: Size must be at least 1.");
            return;
        }

        for (int row = 1; row <= size; row++) {
            if (row == 1 || row == size) {
                // first row: single #, last row: full row of #
                for (int col = 0; col < row; col++) {
                    System.out.print("#");
                }
            } else {
                // middle rows: # at start and end, spaces inside
                System.out.print("#");
                for (int col = 1; col < row - 1; col++) {
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("5x4 Rectangle:");
        createRectangle(5, 4);

        System.out.println();

        System.out.println("5x5 Isosceles Right Triangle:");
        createTriangle(5);
    }
}
