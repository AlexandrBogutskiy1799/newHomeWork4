package Homework4;

public class Main {
    public static void main(String[] args) {
        Bank usdBank1 = new USBank(11111, "USA", Currency.USD, 150, 3510.50, 10, 2500000);
        Bank usdBank2 = new USBank(11112, "USA", Currency.EUR, 100, 1250.50, 25, 1200000);
        Bank eurBank1 = new EUBank(22222, "France", Currency.EUR, 85, 2500.20, 21, 200000);
        Bank eurBank2 = new EUBank(22221, "Ukraine", Currency.EUR, 15, 800.15, 125, 50000);
        Bank chinaBank1 = new ChinaBank(33333, "China", Currency.USD, 125, 1500.10, 145, 615000);
        Bank chinaBank2 = new ChinaBank(33332, "India", Currency.EUR, 58, 505.50, 145125, 15000);

        User user1 = new User(1001, "Vasya", 10000, 5, "Google", 2000, usdBank1);
        User user2 = new User(1002, "Kolya", 11000, 4, "Yandex", 3000, usdBank2);
        User user3 = new User(1003, "Petya", 20100, 8, "Goit", 5000, eurBank1);
        User user4 = new User(1004, "Grisha", 20000, 9, "Flagman", 1000, eurBank2);
        User user5 = new User(1005, "Tolya", 15000, 6, "Velyka kyshenya", 500, chinaBank1);
        User user6 = new User(1006, "Olya", 6300, 1, "Silpo", 2500, chinaBank2);

        System.out.println(user6);
    }
}
