public class disciple {
    String name = "";
    int num;
    boolean messiah;
    public disciple(String name, int num, boolean messiah) {
        this.name = name;
        this.num = num;
        this.messiah = messiah;
    }

    public String getName() {
        return name;
    }

    public int nDisciples() {
        return num;
    }

    public boolean isMessiah() {
        return messiah;
    }


}
