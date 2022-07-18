public class Enums {
    
    enum Season {
        SPRING, AUTUMN, SUMMER, WINTER
    }

public static void main(String[] args) {

    seasonMethod(Season.SUMMER);

}

public static void seasonMethod(Season season) {
    switch(season) {
        case SPRING:
            System.out.println("This is spring...");
            break;
        case AUTUMN:
            System.out.println("This is autumn...");
            break;
        case SUMMER:
            System.out.println("This is summer...");
            break;
        case WINTER:
            System.out.println("This is winter...");
            break;
    }
}
}
