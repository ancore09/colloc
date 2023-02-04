public class BaseServiceDecorator implements Service {
    Service service;

    public BaseServiceDecorator(Service service) {
        this.service = service;
    }

    public void doSomething() {
        service.doSomething();
    }
}
