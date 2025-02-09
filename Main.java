public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Turtlebob());
        Thread t2 = new Thread(new TurtleJane());
        Thread t3 = new Thread(new TurtleAC());

        t1.start();
        t2.start();
        t3.start();
    }
}

class Turtlebob implements Runnable {
    public void run() {
        walk();
    }
    public void walk() {
        Turtle turtle = new Turtle();
        turtle.setPosition(0,0);
        turtle.penColor("wheat");
        turtle.width(10);
        turtle.left(30);
        turtle.forward(300);
        turtle.home();
        turtle.left(150);
        turtle.forward(300);
        turtle.right(120);
        turtle.forward(300);
        turtle.right(60);
        turtle.forward(300);
        turtle.home();

        turtle.right(90);
        turtle.forward(50);
        turtle.right(120);
        turtle.forward(300);
        turtle.right(60);
        turtle.forward(50);

        turtle.home();
        turtle.right(90);
        turtle.forward(50);
        turtle.left(120);
        turtle.forward(300);
        turtle.left(60);
        turtle.forward(50);
    }
}

class TurtleJane implements Runnable {
    public void run() {
        walk();
    }
    public void walk() {
        Turtle turtle = new Turtle();
        turtle.home();
        turtle.width(4);
        turtle.right(90);
        turtle.forward(100);

        turtle.right(120);
        turtle.forward(280);
        turtle.right(60);
        turtle.forward(50);

        turtle.setPosition(0, -50);
        turtle.home();
        turtle.right(90);
        turtle.forward(100);
        turtle.left(120);
        turtle.forward(295);
        turtle.left(60);
        turtle.forward(50);
        turtle.setPosition(0, -50);
        turtle.home();

/**ที่ผูก*/
        turtle.right(90);
        turtle.forward(50);
        turtle.right(120);
        turtle.forward(250);
        turtle.right(60);
        turtle.width(15);
        turtle.penColor("pink");
        turtle.forward(50);
        turtle.right(60);
        turtle.forward(300);
        turtle.right(180);
        turtle.forward(300);
        turtle.penColor("wheat");
        turtle.width(10);
        turtle.home();

        turtle.right(90);
        turtle.forward(50);
        turtle.right(120);
        turtle.forward(225);
        turtle.right(60);
        turtle.width(15);
        turtle.penColor("pink");
        turtle.forward(50);
        turtle.right(60);
        turtle.forward(300);
        turtle.right(180);
        turtle.forward(300);
        turtle.penColor("wheat");
        turtle.width(10);
        turtle.penColor("wheat");
        turtle.width(10);
        turtle.home();
      }

}

class TurtleAC implements Runnable {
    public void run() {
        walk();
    }
    public void walk() {
        Turtle turtle = new Turtle();


        turtle.left(150);
        turtle.forward(300);
        turtle.right(120);
        turtle.forward(250);
        turtle.right(60);
        turtle.width(15);
        turtle.penColor("pink");
        turtle.forward(300);
        turtle.right(60);
        turtle.forward(50);
        turtle.right(180);
        turtle.forward(50);
        turtle.penColor("wheat");
        turtle.width(10);
        turtle.home();

        turtle.left(150);
        turtle.forward(300);
        turtle.right(120);
        turtle.forward(225);
        turtle.right(60);
        turtle.width(15);
        turtle.penColor("pink");
        turtle.forward(300);
        turtle.right(60);
        turtle.forward(50);
        turtle.right(180);
        turtle.forward(50);
        turtle.penColor("wheat");
        turtle.width(10);
        turtle.home();

        turtle.left(150);
        turtle.forward(235);
        turtle.right(120);
        turtle.width(0.1);
        turtle.penColor("white");
        turtle.forward(235);
        turtle.penColor("yellow");
        turtle.width(30);
        for (int i = 0; i < 360; i++) {
            turtle.forward(2 * Math.PI * 10 / 360);
            turtle.left(1);
        }
        turtle.up();

    }
}
