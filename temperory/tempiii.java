public class tempiii {
    public static void main(String[] args) {
        parent n1 = new parent();
        n1.display();
    }
    
}


class parent {
    void display() {
        System.out.println("parent class");
    }
}

class child extends parent {
    @Override
    void display() {
        System.out.println("Child class");
    }
}
