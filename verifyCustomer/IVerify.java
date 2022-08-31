package hw4_smith.src.part3;


public interface IVerify {

    void name();

    void phoneNumber();

    void address();

}

class InHouseVerifier implements IVerify {
    public void name() {
        System.out.print("Alice");
    }

    public void phoneNumber() {
        System.out.print("," + " 222-333-4444");

    }

    public void address() {
        System.out.print("," + " 123 Main St, Boston, MA");

    }
}

class ABCAdapter implements IVerify {
    Abc abc;

    public ABCAdapter(Abc abc) {
        this.abc = abc;

    }

    public void name() {
        abc.name();
    }

    public void phoneNumber() {
        for (int i = 0; i < 5; i++) {
            abc.phoneNumber();
        }
    }

    public void address() {
        abc.address();
    }
}

