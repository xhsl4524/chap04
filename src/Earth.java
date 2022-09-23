public class Earth {
    public static final double EARTH_RADIUS = 6400;

    public static final double EARTH_SURFCE_AREA;

    static {
        EARTH_SURFCE_AREA = 4* Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
