package exam;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu co trong mang: ");
        int num = Integer.parseInt(scanner.nextLine());
        int [] array = new int[num];
        do {
            System.out.println("1.Nhap gia tri cac phan tu mang: ");
            System.out.println("2.Hien thi gia tri cac phan tu mang");
            System.out.println("3.In ra gia tri la cac so nguyen to");
            System.out.println("4.In ra gia tri max, min trong mang");
            System.out.println("5.Sap xep mang giam dan");
            System.out.println("6.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("Gia tri cua phan tu %d la: ",i);
                        array[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Mang vua khoi tao: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("%d\t",array[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    boolean check = false;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]>=2) {
                            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                                if (array[i] % j == 0) {
                                    check = true;
                                    break;
                                }
                            }
                            if (!check) {
                                System.out.printf("%d la so nguyen to\n", array[i]);
                            }
                        }
                        continue;
                    }
                    break;
                case 4:
                    int max = array[0], min = array[0];
                    for (int i = 0; i < array.length; i++) {
                        if (max<array[i]){
                            max = array[i];
                        }
                    }
                    for (int i = 0; i < array.length; i++) {
                        if (min>array[i]){
                            min = array[i];
                        }
                    }
                    System.out.printf("Gia tri lon nhat trong mang la: %d\n",max);
                    System.out.printf("Gia tri nho nhat trong mang la: %d",min);
                    System.out.println();
                    break;
                case 5:
                    for (int i = 0; i < array.length-1; i++) {
                        for (int j = i+1; j <array.length ; j++) {
                            if (array[i]<array[j]){
                                int x = array[i];
                                array[i] = array[j];
                                array[j] = x;
                            }
                        }
                    }
                    System.out.println("Mang sau khi sap xep giam dan la: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("%d\t",array[i]);
                    }
                    System.out.println();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap tu 1 den 6 thoi");
                    break;
            }
        }while (true);

    }
}
