package abstractfactory;

public class Driver {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Customer1", DietPlan.NO_RESTRICTION);
        Customer customer2 = new Customer("Customer2", DietPlan.PALEO);
        Customer customer3 = new Customer("Customer3", DietPlan.VEGAN);
        Customer customer4 = new Customer("Customer4", DietPlan.NUT_ALLERGY);
        Customer customer5 = new Customer("Customer5", DietPlan.NO_RESTRICTION);
        Customer customer6 = new Customer("Customer6", DietPlan.PALEO);

        customer1.createMeal();
        customer2.createMeal();
        customer3.createMeal();
        customer4.createMeal();
        customer5.createMeal();
        customer6.createMeal();
    }
}
