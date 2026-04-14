package Section6;

public class LoopShapeTest {

    public static void main(String[] args) {
        System.out.println("3x3 Rectangle:");
        LoopShape.createRectangle(3, 3);

        System.out.println();

        System.out.println("1x1 Rectangle:");
        LoopShape.createRectangle(1, 1);

        System.out.println();

        System.out.println("Invalid (0x3) Rectangle:");
        LoopShape.createRectangle(0, 3);

        System.out.println();

        System.out.println("4-size Triangle:");
        LoopShape.createTriangle(4);

        System.out.println();

        System.out.println("1-size Triangle:");
        LoopShape.createTriangle(1);

        System.out.println();

        System.out.println("Invalid (-1) Triangle:");
        LoopShape.createTriangle(-1);
    }
}
