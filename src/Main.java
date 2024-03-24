import java.util.ArrayList;
import java.util.Scanner;

class shop {
    public static void main(String[] args) {
        String[] chasifirms = {"Casio", "Chanel", "Rolex"};
        String[][] chasiModels = {{"G-Shock", "Casio"}, {"J12", "Chanel"}, {"Submariner", "Rolex"}};

        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ФИО:");
            String FIO = scanner.nextLine();
            System.out.println("Введите почту:");
            String email = scanner.nextLine();
            System.out.println("Введите номер телефона:");
            String phonenumber = scanner.nextLine();

            System.out.println("Доступные бренды и модели:");
            for (int j = 0; j < chasifirms.length; j++) {
                for (int k = 0; k < chasiModels[j].length; k++) {
                    System.out.println(j + 1 + ": " + chasiModels[j][k] + " - " + chasifirms[j]);
                }
            }

            System.out.println("Введите название желаемый бренд и модель:");
            int position = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.println("Количество:");
            int quantity = Integer.parseInt(scanner.nextLine());

            customers.add(new Customer(FIO, email, phonenumber, chasifirms[position], chasiModels[position], quantity));
        }

        for (Customer customer : customers) {
            System.out.println("ФИО: " + customer.getFIO());
            System.out.println("Почта: " + customer.getemail());
            System.out.println("Номер телефона: " + customer.getphonenumber());
            System.out.println("Позиция: " + customer.getchasifirms() + " - " + customer.getchasiModels());
            System.out.println("Количество: " + customer.getquantity());
            System.out.println();
        }
    }
}

class Customer {
    private String FIO;
    private String email;
    private String phonenumber;
    private String chasifirms;
    private String[] chasiModels;
    private int quantity;

    public Customer(String FIO, String email, String phonenumber, String chasifirms, String[] chasiModels, int quantity) {
        this.FIO = FIO;
        this.email = email;
        this.phonenumber = phonenumber;
        this.chasifirms = chasifirms;
        this.chasiModels = chasiModels;
        this.quantity = quantity;
    }

    public String getFIO() {
        return FIO;
    }

    public String getemail() {
        return email;
    }

    public String getphonenumber() {
        return phonenumber;
    }

    public String getchasifirms() {
        return chasifirms;
    }

    public String[] getchasiModels() {
        return chasiModels;
    }

    public int getquantity() {
        return quantity;
    }

}