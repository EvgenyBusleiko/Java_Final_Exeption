package Java_Final_Expection;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
//        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Пол обозначается только буквой f или m", i);
        System.out.println();
    }
}
