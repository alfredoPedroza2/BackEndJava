package Mona;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        ShowMonaBoxeCat();
        Thread.sleep(2000);
        System.out.println("\n\n");
        ShowMonaSkate();
        Thread.sleep(2000);
        System.out.println("\n\n");
        ShowMonaLuchador();
        Thread.sleep(2000);
        System.out.println("\n\n");
        ShowMonaLab();
        Thread.sleep(2000);
        System.out.println("\n\n");
        ShowMonaRobot();
        Thread.sleep(2000);
        System.out.println("\n\n");
        ShowMonaClass();
    }

     static void ShowMonaBoxeCat()throws InterruptedException{
        Mona MonaBoxe = new MonaBoxeToCat("Mona Boxe");
        Thread.sleep(2000);
        System.out.println();
        MonaBoxe.caminar();
        Thread.sleep(2000);
        System.out.println();
        MonaBoxe.comer();
        Thread.sleep(2000);
        System.out.println();
        MonaBoxe.dormir();
    }

    static void ShowMonaSkate() throws InterruptedException{
        Mona MonaSkate = new MonaSkateToCat("Mona Skate");
        Thread.sleep(2000);
        System.out.println();
        MonaSkate.caminar();
        Thread.sleep(2000);
        System.out.println();
        MonaSkate.comer();
        Thread.sleep(2000);
        System.out.println();
        MonaSkate.dormir();
    }

    static void ShowMonaLuchador() throws InterruptedException{
        Mona MonaLuchador = new MonaLuhadorToCat("Mona Luchador");
        Thread.sleep(2000);
        System.out.println();
        MonaLuchador.caminar();
        Thread.sleep(2000);
        System.out.println();
        MonaLuchador.comer();
        Thread.sleep(2000);
        System.out.println();
        MonaLuchador.dormir();
    }

    static void ShowMonaLab() throws InterruptedException{
        Mona MonaLab = new MonaLabToCat("Mona Cientifico");
        Thread.sleep(2000);
        System.out.println();
        MonaLab.caminar();
        Thread.sleep(2000);
        System.out.println();
        MonaLab.comer();
        Thread.sleep(2000);
        System.out.println();
        MonaLab.dormir();
    }

    static void ShowMonaRobot() throws InterruptedException{
        Mona MonaRobot = new MonaRobotToCoat("Mona Robot");
        Thread.sleep(2000);
        System.out.println();
        MonaRobot.caminar();
        Thread.sleep(2000);
        System.out.println();
        MonaRobot.comer();
        Thread.sleep(2000);
        System.out.println();
        MonaRobot.dormir();
    }

    static void ShowMonaClass()throws InterruptedException{
        Mona MonaClass = new MonaClassToCat("Mona Class");
        Thread.sleep(2000);
        System.out.println();
        MonaClass.caminar();
        Thread.sleep(2000);
        System.out.println();
        MonaClass.comer();
        Thread.sleep(2000);
        System.out.println();
        MonaClass.dormir();
    }
}
