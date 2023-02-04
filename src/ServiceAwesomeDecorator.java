public class ServiceAwesomeDecorator implements Service {
    private Service service;

    public ServiceAwesomeDecorator(Service service) {
        this.service = service;
    }

    public void doSomething() {
        System.out.println("Awesome!");
        service.doSomething();
    }
}
