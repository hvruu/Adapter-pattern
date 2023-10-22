class WindowsOS {
    public void runWindows() {
        System.out.println("Running Windows");
    }
}

class LinuxOS {
    public void runLinux() {
        System.out.println("Running Linux");
    }
}

interface VirtualMachine {
    void start();
    void stop();
}

class LinuxVMAdapter implements VirtualMachine {
    private LinuxOS linuxOS;

    public LinuxVMAdapter() {
        linuxOS = new LinuxOS();
    }

    @Override
    public void start() {
        linuxOS.runLinux();
    }

    @Override
    public void stop() {
        System.out.println("Stopping Linux VM");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Using Windows OS:");

        WindowsOS windowsOS = new WindowsOS();
        windowsOS.runWindows();

        System.out.println("\nUsing Linux VM via Adapter:");

        VirtualMachine linuxVM = new LinuxVMAdapter();
        linuxVM.start();
        linuxVM.stop();
    }
}


