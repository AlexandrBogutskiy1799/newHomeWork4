package Homework4;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return switch (getCurrency()) {
            case USD -> 100;
            case EUR -> 150;
        };
    }

    @Override
    int getLimitOfFunding() {
        return switch (getCurrency()) {
            case USD -> 1000;
            case EUR -> 5000;
        };
    }

    @Override
    int getMonthlyRate() {
        return switch (getCurrency()) {
            case USD -> 1;
            case EUR -> 0;
        };
    }

    @Override
    int getCommission(int sum) {
        if ((sum <= 1000) && (getCurrency().equals(Currency.USD))) {
            return 3;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.USD))) {
            return 5;
        }
        if ((sum <= 1000) && (getCurrency().equals(Currency.EUR))) {
            return 10;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.EUR))) {
            return 11;
        }
        return 0;

    }
}
