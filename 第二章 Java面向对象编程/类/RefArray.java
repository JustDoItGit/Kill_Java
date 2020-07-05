package 类;

public class RefArray {
    public static void main(String[] args) {
        Merchandise[] merchandises = new Merchandise[9];
        merchandises[0] = new Merchandise();
        merchandises[1] = new Merchandise();
        merchandises[0].name = "Mac Book Pro";
        System.out.println(merchandises[0].name);

        System.out.println(merchandises[2]);

    }
}
