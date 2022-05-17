public class LegalPerson extends Client{
    public LegalPerson() {
    }

    @Override
    public void take(double credit) {
        double commission = credit * 0.01;
        super.take(credit + commission);
    }

    @Override
    public void print() {
        System.out.println("Условие Снятие 1 процент");
        System.out.println("Баланс: " + super.getAmount());

    }
}
