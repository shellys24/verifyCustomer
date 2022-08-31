package hw4_smith.src.part3;


public class IVerifyTestDrive {

    public static void main(String[] args) {

        IVerify iverify = new InHouseVerifier();
        Abc abc = new ABCVerifier();
        ABCAdapter abcAdapter = new ABCAdapter(abc);

        System.out.print("Doing in house verification for ");
        abcValidator(iverify);

        System.out.print("\nABC third-party verification for ");
        xyzChecker(iverify);
        iverify.phoneNumber();

        System.out.print("\nXYZ third-party background verification for ");
        xyzChecker(iverify);
        iverify.address();

    }

    static void abcValidator(IVerify iverify) {
        iverify.name();


    }

    static void xyzChecker(IVerify iverify) {
        iverify.name();

    }

}

