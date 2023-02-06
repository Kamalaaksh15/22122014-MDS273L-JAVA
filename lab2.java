Lab Exercise Question

You are supposed to create a menu-driven program that has the following menu options:
Enter a name
Search for a name
Remove a name
Show all names

Note:
The menu-driven program has to be made with the help of a do-while loop and switch-case statements.

Constraints:
The names collected must be stored in an array with a max length of 1024.
The names in the array should be UNIQUE; no duplicate entries are expected!
Provide necessary validations that the user enters only valid names that are not going to be repeated.
Removing a name should not create empty space inside the array!
Format your results properly!!



import java.util.Scanner;

public class two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[1024];
        Boolean flag = false;
        int ii = 0;
        do {

            flag = true;
            System.out.println("########### MENU ###########");
            System.out.println("## 1. Enter the name:    ###");
            System.out.println("## 2. Search for a name: ###");
            System.out.println("## 3. Remove a name:    ####");
            System.out.println("## 4. Print the name list ##");
            System.out.println("## 5. Quit              ####");
            System.out.println("############################");
            System.out.println("Enter your choice: ");
            int inp = Integer.parseInt(sc.nextLine());

            switch (inp) {
                case 1: {

                    System.out.print("Enter your name: ");
                    names[ii] = sc.nextLine();
                    ii++;
                    break;

                }
                case 2: {
                    int j;
                    System.out.println("Which name your are searching?.");
                    String sch = sc.nextLine();
                    for (j = 0; j < names.length; j++) {
                        if (sch.equals(names[j])) {
                            System.out.println("Name is found at position " + (j + 1));
                            break;

                        }

                    }
                    break;
                }
                case 3: {
                    int j;
                    System.out.println("Which name you want to delete. :");
                    String ntemp = sc.nextLine();
                    for (j = 0; j < names.length; j++) {
                        if (ntemp.equals(names[j])) {
                            for (; j < names.length - 1; j++) {
                                names[j] = names[j + 1];

                            }

                        }

                    }
                    break;

                }
                case 4: {
                    System.out.println("Your list are: ");
                    for (String a : names) {
                        if (a != null) {
                            System.out.print(a + ",");
                        }

                    }
                    System.out.println();
                    break;
                }
                case 5: {

                    System.out.println("Program will now wxit in 3.2.1..");
                    flag = false;
                    break;
                }

            }

        } while (flag);

    }
}
