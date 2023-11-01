public class LinearEquation {
    private double x;
    private double y;
    private double x1;
    private double y1;


    public LinearEquation(double x, double y, double x1, double y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double distance() {
        return roundedToHundredth(Math.sqrt((Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2))));
    }

    public double slope() {
        return roundedToHundredth(((y1 - y) / (x1 - x)));
    }

    public double yIntercept() {
        return roundedToHundredth((y - (slope() * x)));
    }

    public String equation() {
        if (y == y1) {
            return Double.toString(yIntercept());
        } else if ((y1 - y) % (x1 - x) == 0) {
            return "y = " + (int) ((y1 - y) / (x1 - x)) + "x + " + yIntercept();
        } else if ((y1 - y) % (x1 - x) ==  0 && yIntercept()<0) {
            return "y = " + (int) ((y1 - y) / (x1 - x)) + "x - " + (Math.abs(yIntercept()));
        } else if ((x1 - x) < 0 && (y1 - y) > 0) {
            return "y = -" + (int) (y1 - y) + "/" + (int) (Math.abs(x1 - x)) + "x + " + yIntercept();
        } else if ((x1 - x) < 0 && (y1 - y) < 0) {
            return "y = " + (int) (Math.abs(y1 - y)) + "/" + (int) (Math.abs(x1 - x)) + "x + " + yIntercept();
        } else if (yIntercept() == 0) {
            return "y = " + (int) (y1 - y) + "/" + (int) (x1 - x) + "x";
        } else if (yIntercept() < 0) {
            return "y = " + (int) (y1 - y) + "/" + (int) (x1 - x) + "x - " + (Math.abs(yIntercept()));
        } else if (((y1 - y) / (x1 - x)) == 1) {
            return "y = x +" + yIntercept();
        } else if (((y1 - y) / (x1 - x)) == -1) {
            return "y = -x +" + yIntercept();
        }else{
            return "y = " + (int) (y1 - y) + "/" + (int) (x1 - x) + "x + " + yIntercept();
        }
}
    public String coordinateForX(double x){
        return "("+x+", "+roundedToHundredth((x*slope()+yIntercept()))+")";




    }
    public String lineInfo(){
        String w = "";
        w += "\nThe two points are: ("+(int)x+", "+(int)y+")"+" and "+"("+(int)x1+", "+(int)y1+")";
        w += "\nThe equation of the line between these points is: "+equation();
        w += "\nThe slope of this line is: "+slope();
        w += "\nThe y-intercept of this line is: "+ yIntercept();
        w += "\nThe distance between these points is "+ distance();
        return w;
    }
    public double roundedToHundredth(double toRound){
        toRound = Math.round(toRound * 100.0) / 100.0;
        return toRound;
    }




}
