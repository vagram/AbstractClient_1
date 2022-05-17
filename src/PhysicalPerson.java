public class PhysicalPerson extends Client{

    @Override
    public void print() {
        System.out.println("Условие Пополнение Снятие без процентов");
        System.out.println("Баланс: " + super.getAmount());
    }
}
