public class IndividualBusinessman extends Client{
    public IndividualBusinessman() {
    }

    @Override
    public void put(double deposit) {
        double commision;
        if (deposit <= 1000) {
            commision = deposit * 0.01;
            super.put(deposit - commision);
        }else if (deposit > 1000){
            commision = deposit * 0.005;
            super.put(deposit - commision);
        }
    }

    @Override
    public void print() {
        System.out.println("Условие Пополнение 1 процент Снятие без процентов");
        System.out.println("Баланс: " + super.getAmount());

    }
}
