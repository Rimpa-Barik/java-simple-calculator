import java.util.Scanner;
class Calculator {
    String[] history=new String[10];
    int i1=0;

    void addition(String a, String b) throws InvalidInputException {
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("The sum is " + sum);
            if (i1 == 10) {
                System.out.println("History is full");
            } else {
                history[i1] = (a +" + "+ b + " = "+ sum);
                i1++;
            }
    }
void subtract(String a, String b) throws InvalidInputException {
    for (int i = 0; i < a.length(); i++) {
        char c = a.charAt(i);
        if (c < '0' || c > '9') {
            throw new InvalidInputException("Invalid input");
        }
    }
    for (int i = 0; i < b.length(); i++) {
        char c = b.charAt(i);
        if (c < '0' || c > '9') {
            throw new InvalidInputException("Invalid input");
        }
    }
    int sub= Integer.parseInt(a) - Integer.parseInt(b);
    System.out.println("The subtraction is " + sub);
        if (i1 == 10) {
            System.out.println("History is full");
        } else {
            history[i1] = (a +" - "+ b + " = "+ sub);
            i1++;
        }
}
    void multiply(String a, String b) throws InvalidInputException {
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        int mul= Integer.parseInt(a) * Integer.parseInt(b);
        System.out.println("The multiplication is " + mul);
            if (i1 == 10) {
                System.out.println("History is full");
            } else {
                history[i1] = (a +" * "+ b + " = "+ mul);
                i1++;
            }
        }
    void divide(String a, String b) throws InvalidInputException {
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        int a1 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        try {
            if (b2 == 0) {
                throw new ArithmeticException("not divide by 0");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        }
        int div = a1 / b2;
        System.out.println("The division is " + div);
        if (i1 == 10) {
            System.out.println("History is full");
        } else {
            history[i1] = (a + " / " + b + " = " + div);
            i1++;
        }
    }

    void remainder(String a, String b) throws InvalidInputException {
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c < '0' || c > '9') {
                throw new InvalidInputException("Invalid input");
            }
        }
        int a1 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        try {
            if (b2 == 0) {
                throw new ArithmeticException("not divide by 0");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        }
        int rem = a1 % b2;
        System.out.println("The Remainder is " + rem);
        if (i1 == 10) {
            System.out.println("History is full");
        } else {
            history[i1] = (a + " % " + b + " = " + rem);
            i1++;
        }
    }
    void displayHistory(){
        for (int j = 0; j <i1; j++) {
            System.out.println((j+1)+". "+history[j]);
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        while (true) {
            System.out.println("***** Choose one to perform operations: *****");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. History");
            System.out.println("7. Exit");
            int choice;
            while (true) {
                try {
                    choice = sc.nextInt();
                    if (choice < 1 || choice > 7) {
                        throw new InvalidChoiceException("Invalid Choice");
                    }
                    break;
                } catch (InvalidChoiceException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Enter again: ");
                }
            }
            switch (choice) {
                case 1: {
                    sc.nextLine();
                    System.out.println("***** Well!! You chose addition:  *****");
                    while (true) {
                        try {
                            System.out.println("Enter one number: ");
                            String a = sc.nextLine();
                            System.out.println("Enter another number: ");
                            String b = sc.nextLine();
                           c.addition(a, b);
                           break;
                        } catch (InvalidInputException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Enter again: ");
                        }
                    }
                    break;
                }
                case 2:{
                    sc.nextLine();
                    System.out.println("***** Well!! You chose subtraction: *****");
                    while (true) {
                        try {
                            System.out.println("Enter one number: ");
                            String a = sc.nextLine();
                            System.out.println("Enter another number: ");
                            String b = sc.nextLine();
                           c.subtract(a, b);
                           break;
                        } catch (InvalidInputException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Enter again: ");
                        }
                    }
                    break;
                }
                case 3:{
                    sc.nextLine();
                    System.out.println("***** Well!! You chose multiplication: *****");
                    while (true) {
                        try {
                            System.out.println("Enter one number: ");
                            String a = sc.nextLine();
                           System.out.println("Enter another number: ");
                            String b = sc.nextLine();
                            c.multiply(a, b);
                            break;
                        } catch (InvalidInputException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Enter again: ");
                        }
                    }
                    break;
                }
                case 4:{
                    sc.nextLine();
                    System.out.println("***** Well!! You chose division: *****");
                    while (true) {
                        try {
                            System.out.println("Enter one number: ");
                            String a = sc.nextLine();
                            System.out.println("Enter another number: ");
                            String b = sc.nextLine();
                            c.divide(a, b);
                            break;
                        } catch (InvalidInputException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Enter again: ");
                        }
                    }
                    break;
                }
                case 5:{
                    sc.nextLine();
                    System.out.println("***** Well!! You chose Remainder: *****");
                    while (true) {
                        try {
                            System.out.println("Enter one number: ");
                            String a = sc.nextLine();
                            System.out.println("Enter another number: ");
                            String b = sc.nextLine();
                           c.remainder(a, b);
                           break;
                        } catch (InvalidInputException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Enter again: ");
                        }
                    }
                    break;
                }
                case 6:{
                    sc.nextLine();
                    if(c.i1==0){
                        System.out.println("History is empty");
                    }
                    else {
                        System.out.println("***** HISTORY *****");
                        c.displayHistory();
                        break;
                    }
                    break;
                }
                case 7:{
                    System.out.println("You chose Exit");
                    return;
                }
            }
        }
    }
}
class InvalidChoiceException extends RuntimeException{
    InvalidChoiceException(String message){
        super(message);
    }
}