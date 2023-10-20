interface Type_C_Device {
    void Connect_To_Device();
}

interface AdapterC_To_A extends Type_C_Device {
    void TransferFile(String FileName, String Type);
}

interface Legacy_laptop {
    void Port(String Type);

    void TransferFile(String FileName, String Type);
}

class Adapter implements AdapterC_To_A {

    @Override
    public void Connect_To_Device() {
        System.out.println("Connected to Type A Device");
    }

    @Override
    public void TransferFile(String FileName, String Type) {
        System.out.println("Transferring file via Adapter");
    }
}

class laptop implements Legacy_laptop {
    Adapter adapter;

    public laptop() {

    }

    @Override
    public void Port(String Type) {
        if (Type.equalsIgnoreCase("Type C")) {
            adapter = new Adapter();
            adapter.Connect_To_Device();
        } else if (Type.equalsIgnoreCase("Type A")) {
            System.out.println("External Device connected");
        } else {
            System.out.println("Type Invalid");
        }
    }

    @Override
    public void TransferFile(String FileName, String Type) {
        if (Type.equalsIgnoreCase("Type C")) {
            adapter = new Adapter();
            adapter.TransferFile(FileName, Type);
        } else if (Type.equalsIgnoreCase("Type A")) {
            System.out.println("File is being transferred");
        } else {
            System.out.println("Type Invalid");
        }
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        laptop myLaptop = new laptop();
        myLaptop.Port("Type C");
        myLaptop.TransferFile("Hello.txt", "Type C");
        myLaptop.Port("Type A");
        myLaptop.TransferFile("Bye.txt", "Type A");
    }
}
