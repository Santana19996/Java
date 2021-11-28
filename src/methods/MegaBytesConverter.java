package methods;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int findMb = kiloBytes / 1024;
            int findRemaining = Math.round(kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + findMb + " MB and " + findRemaining + " KB"   );
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
    }
}

//1MB = 1024 KB
