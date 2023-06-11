package Homework4;

public class USBank extends Bank{
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return switch (getCurrency()) {
            case USD -> 1000;
            case EUR -> 1200;
        };
    }

    @Override
    int getLimitOfFunding() {

        return switch (getCurrency()) {
            case USD -> 0;
            case EUR -> 10000;
        };
    }

    @Override
    int getMonthlyRate() {
        return switch (getCurrency()) {
            case USD -> 1;
            case EUR -> 2;
        };
    }

    @Override
    int getCommission(int sum) {
        if ((sum <= 1000) && (getCurrency().equals(Currency.USD))) {
            return 5;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.USD))) {
            return 7;
        }
        if ((sum <= 1000) && (getCurrency().equals(Currency.EUR))) {
            return 6;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.EUR))) {
            return 8;
        }


        return 0;
    }
}
