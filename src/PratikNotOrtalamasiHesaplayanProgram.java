import java.util.Scanner;


public class PratikNotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz;
        Scanner input= new Scanner(System.in);
        System.out.print("Matematik Notunuz:");
        mat=input.nextInt();
        System.out.print("Fizik Notunuz:");
        fiz=input.nextInt();
        System.out.print("Kimya Notunuz:");
        kim=input.nextInt();
        System.out.print("Türkçe Notunuz:");
        tur=input.nextInt();
        System.out.print("Tarih Notunuz:");
        tar=input.nextInt();
        System.out.print("Müzik Notunuz:");
        muz=input.nextInt();

        double ort=(mat+fiz+kim+tur+tar+muz)/6;
        System.out.println("ORTALAMA:"+ort);
        String durum=(ort>60)?"SINIF GEÇİLDİ":"SINIFTAN GEÇEMEDİNİZ";
    }
}
