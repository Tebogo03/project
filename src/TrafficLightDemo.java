public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLight ti = new TrafficLight();
        for (int i =0; i<9;i++){
            System.out.println(ti);
            ti.changeColor();
        }
    }
}

class TrafficLight{
    TrafficLightColour tlc = TrafficLightColour.RED;
    public void changeColor(){
        switch (tlc){
            case RED :
                tlc = TrafficLightColour.GREEN;
                break;
            case GREEN:
                tlc = TrafficLightColour.YELLOW;
                break;
            case YELLOW:
                tlc = TrafficLightColour.RED;break;

        }
    }
    public String toString(){
        return " " + tlc;
    }

}
enum TrafficLightColour{
    RED, GREEN, YELLOW
}
