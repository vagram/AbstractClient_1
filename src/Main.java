public class Main {
    public static void main(String[] args){

        PhysicalPerson physicalPerson = new PhysicalPerson();
        physicalPerson.put(100);
        physicalPerson.take(10);
        System.out.println("Баланс Physicalperson: " + physicalPerson.getAmount() + "\n");
        LegalPerson legalPerson = new LegalPerson();
        legalPerson.put(100);
        legalPerson.take(10);
        System.out.println("Баланс Legalperson: " + legalPerson.getAmount() + "\n");
        IndividualBusinessman individualBusinessman = new IndividualBusinessman();
        individualBusinessman.put(1000);
        individualBusinessman.take(10);
        System.out.println("Баланс Individualbusinessman: " + individualBusinessman.getAmount());

    }
}
