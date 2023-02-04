public class ServiceAwesomeDecorator extends BaseServiceDecorator {

    public ServiceAwesomeDecorator(Service service) {
        super(service);
    }

    public void doSomething() {
        System.out.println("Awesome!");
        service.doSomething();
    }
}
