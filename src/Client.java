public  abstract class Client {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double getAmount) {
        this.amount = getAmount;
    }
    public void put(double deposit){
        if (deposit > 0) {
            amount = amount + deposit;
            System.out.println("Сумма пополнения: " + deposit);
            return;
        } System.out.println("Нельзя пополнить на отрицательное значение!");
    }

    public void take(double credit){
        if (credit <= amount) {
            amount = amount - credit;
            System.out.println("Сумма снятия: " + credit);
            return;
        } System.out.println("Сумма снятия превышает баланс!");
    }
    public abstract void print();

}
