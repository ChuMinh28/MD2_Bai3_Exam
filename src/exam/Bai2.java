package exam;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so cot:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so hang:");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[n][m];
        do {
            System.out.println("1.Nhap gia tri cac phan tu cua mang");
            System.out.println("2.In ra gia tri cua mang theo ma tran");
            System.out.println("3.In gia tri cac phan tu tren duong cheo chinh, phu va tinh tong ");
            System.out.println("4.Sap xep mang tang dan theo cot");
            System.out.println("5.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("[%d][%d]=", i, j);
                            array[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mang vua khoi tao:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("%d\t", array[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum = 0;

                    if (n == m) {

                        System.out.println("Cac phan tu nam tren duong cheo chinh: ");
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                if (i == j) {
                                    System.out.printf("%d\t", array[i][j]);
                                    sum += array[i][j];
                                }
                            }
                        }
                        System.out.println();
                        System.out.printf("Tong cac phan tu tren duong cheo chinh la: %d\n", sum);
                    } else {
                        System.out.println("Ma tran tren khong phai la hinh vuong nhe");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap tu 1 den 5 thoi");
                    break;
            }
        } while (true);
    }
}
