import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation linearEquation;
    private Scanner myScanner;
    public LinearEquationLogic() {
        linearEquation = null; // will initialize from user input
        myScanner = new Scanner(System.in);
    }
    public void start() {
        getCoordinate();
        goon();
    }
    private void getCoordinate(){
        System.out.println("Welcome to yuhao's linear calculator ");
        System.out.print("Enter coordinate 1: ");
        String firstCoordinate = myScanner.nextLine();
        int x = Integer.parseInt(firstCoordinate.substring(firstCoordinate.indexOf("(")+1, firstCoordinate.indexOf(",")));
        int y = Integer.parseInt(firstCoordinate.substring(firstCoordinate.indexOf(",")+2, firstCoordinate.indexOf(")")));
        System.out.print("Enter coordinate 2: ");
        String SecondCoordinate = myScanner.nextLine();
        int x1 = Integer.parseInt(SecondCoordinate.substring(SecondCoordinate.indexOf("(")+1, SecondCoordinate.indexOf(",")));
        int y1 = Integer.parseInt(SecondCoordinate.substring(SecondCoordinate.indexOf(",")+2, SecondCoordinate.indexOf(")")));
        if (x==x1){
            System.out.println("your 2 two coordinates are bananas. The two x values are the same so the slope is undefined ");
        }else{
            linearEquation = new LinearEquation(x, y, x1, y1);
            System.out.println(linearEquation.lineInfo());
            System.out.print("Enter a X value: ");
            double xValue = myScanner.nextDouble();
            myScanner.nextLine();




            System.out.println(linearEquation.coordinateForX(xValue));
        }








    }
    private void goon(){
        boolean on = true;
        while (on) {
            System.out.print("Would you like to enter another coordinate? (y/n) ");
            String go = myScanner.nextLine();
            if (go.equals("y")) {
                getCoordinate();
                on = true;
            } else {
                break;
            }
        }




    }
}
