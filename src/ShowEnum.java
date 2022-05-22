public class ShowEnum {
    public static void main(String[] args) {
        for (ShapeType s: ShapeType.values()
             ) {
            System.out.println(s + " has an original value " +s.ordinal()+ '\n');
            
        }

    }
}
enum ShapeType{
    SQUARE, RECTANGLE, CIRCLE, TRAPEZIUM, RHOMBUS, TRIANGLE, OVAL, HEXAGON
}