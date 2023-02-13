package lab3;

import java.util.Scanner;

public class lab3 {

    Scanner sc = new Scanner(System.in);

    static String[][] collectdata(String[][] arr, int i) {
        // String[] arr2 = new String[4];
        Scanner sc = new Scanner(System.in);
        String name, email, cls, dept, regno;
        System.out.print("Enter the Name: ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter the Reg No: ");
        regno = sc.nextLine();
        System.out.println();
        System.out.print("Enter the Email Id: ");
        email = sc.nextLine();
        System.out.println();
        System.out.println("Enter your Class: ");
        cls = sc.nextLine();
        System.out.println();
        System.out.println("Enter your Department: ");
        dept = sc.nextLine();
        arr[i][0] = name;
        arr[i][1] = regno;
        arr[i][2] = email;
        arr[i][3] = cls;
        arr[i][4] = dept;
        return arr;

    }

    static void dislaydata(String[][] arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i][0] != null) {
                System.out.println("Name is : " + arr[i][0]);
                System.out.println("Reg NO is : " + arr[i][1]);
                System.out.println("Email is : " + arr[i][2]);
                System.out.println("Class is : " + arr[i][3]);
                System.out.println("Dept is : " + arr[i][4]);
                System.out.println();
            } else {
                break;
            }

        }

    }

    static void search(String[][] arr, int cnt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to search");
        String search = sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            if (search.equals(arr[i][0])) {
                System.out.println("Details found");
                System.out.println("Name is : " + arr[i][0]);
                System.out.println("Reg NO is : " + arr[i][1]);
                System.out.println("Email is : " + arr[i][2]);
                System.out.println("Class is : " + arr[i][3]);
                System.out.println("Dept is : " + arr[i][4]);
                System.out.println();
            }
           

        }

    }

    public static void main(String[] args) {
        String[][] arr = new String[1024][5];
        int cnt = 0;
        Scanner scc = new Scanner(System.in);
        boolean flag = false;
        do {

            flag = true;
            System.out.println("########### MENU ##############");
            System.out.println("1. Collet Student Details");
            System.out.println(" 2. Display Details ");
            System.out.println("1 3. Search a student ");
            System.out.println("4. Quit              ");
            System.out.println("###############################");
            System.out.println("Enter your choice: ");
            int inp = Integer.parseInt(scc.nextLine());
            switch (inp) {
                case 1:

                    collectdata(arr, cnt);
                    cnt++;

                    break;
                case 2:
                    dislaydata(arr, cnt);
                  
                    break;
                case 3:
                    search(arr, cnt);
                case 4:
                flag = false;
                break;

            }

        } while (flag);

    }
}
