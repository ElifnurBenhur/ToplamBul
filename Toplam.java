import java.util.Scanner;
public Class Toplam{
        public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0;
        int b=0;
        int toplam=0;
        System.out.println("Lütfen toplamak istediğiniz sayıları bir boşluk ile giriniz:");
        a=in.nextInt();
        b=in.nextInt();
        toplam=a+b;
        System.out.println("Toplam:"+toplam);
        
        
}
}