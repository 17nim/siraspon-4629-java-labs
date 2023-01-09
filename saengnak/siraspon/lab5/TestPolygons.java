package saengnak.siraspon.lab5;

enum PolygonType {
    RECTANGLE, TRIANGLE
}

class Polygon {
    double width, height;
    PolygonType type;
    static int numPolygons;
    static double sumPolygonsArea;

}

    double getArea() {
        switch (type) {
            case RECTANGLE:
                System.out.println(width);
        }
    }

public class TestPolygons {

}