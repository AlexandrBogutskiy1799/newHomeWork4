package Homework4;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return switch (getCurrency()) {
            case USD -> 2000;
            case EUR -> 2200;
        };
    }

    @Override
    int getLimitOfFunding() {
        return switch (getCurrency()) {
            case USD -> 10000;
            case EUR -> 20000;
        };
    }

    @Override
    int getMonthlyRate() {
        return switch (getCurrency()) {
            case USD -> 0;
            case EUR -> 1;
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
            return 2;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.EUR))) {
            return 4;
        }
        return 0;
    }
}
