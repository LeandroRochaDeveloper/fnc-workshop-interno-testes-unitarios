public class TestandoVideoGame {

    public static void main(String [] args) {
        VideoGame ps4 = new VideoGame("PS4");

        System.out.println(ps4.getName());
        System.out.println(ps4.getPrice());

        ps4.setPrice(2000);

        System.out.println(ps4.getPrice());
    }

}
