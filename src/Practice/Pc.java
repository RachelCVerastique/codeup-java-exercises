package Practice;

public class Pc {
    private String cpu;
    private String motherboard;
    private String gpu;
    private boolean wontPost;


 //constructor
    public Pc(String cpu, String motherboard) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.wontPost = true;
    }

//getters / setters


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public boolean isWontPost() {
        return wontPost;
    }


    public static void main(String[] args) {
        Pc Pc1 = new Pc("intel", "Asus");
        System.out.println(Pc1.getCpu());
        System.out.println(Pc1.getMotherboard());
    }




}
