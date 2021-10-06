public class ProxyDemo {

    public static void main(String[] args){
        ProxyServer bossProxy = new ProxyServer(null);

        ProxyServer managerProxy = bossProxy.clone();
        managerProxy.addRestriction("www.facebook.com");

        ProxyServer employeeProxy = managerProxy.clone();
        employeeProxy.addRestriction("www.youtube.com");

        ProxyServer contractEmployeeProxy = employeeProxy.clone();
        contractEmployeeProxy.addRestriction("www.instagram.com");

        Person boss1 = new Person("Bob", bossProxy);
        Person manager1 = new Person("Tom", managerProxy);
        Person employee1 = new Person("John", employeeProxy);
        Person ctEmployee1 = new Person("Sam", contractEmployeeProxy);

        boss1.getPage("www.google.com");
        boss1.getPage("www.facebook.com");
        boss1.getPage("www.youtube.com");
        boss1.getPage("www.instagram.com");
        System.out.println("========================================");

        manager1.getPage("www.google.com");
        manager1.getPage("www.facebook.com");
        manager1.getPage("www.youtube.com");
        manager1.getPage("www.instagram.com");
        System.out.println("========================================");

        employee1.getPage("www.google.com");
        employee1.getPage("www.facebook.com");
        employee1.getPage("www.youtube.com");
        employee1.getPage("www.instagram.com");
        System.out.println("========================================");

        ctEmployee1.getPage("www.google.com");
        ctEmployee1.getPage("www.facebook.com");
        ctEmployee1.getPage("www.youtube.com");
        ctEmployee1.getPage("www.instagram.com");
        System.out.println("========================================");
    }
}
