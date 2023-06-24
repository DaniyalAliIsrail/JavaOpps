package DemoClass;

abstract class Programming {
    public abstract void developer();
}

class HTML extends Programming {
    @Override
    public void developer() {
        System.out.println("Tim Berners-Lee");
    }
}

class Java extends Programming {
    @Override
    public void developer() {
        System.out.println("James Gosling");
    }

    public static void main(String[] args) {
        HTML h = new HTML();
        h.developer();

        Java j = new Java();
        j.developer();
    }
}
