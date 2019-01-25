public class United extends England{
    private String footballer;
    private String colors;
    private String bestForward;
    private int titles;


    public United(String coach, String footballer, String colors, String bestForward, int titles) {
        super(1,  "abc", coach);
        this.footballer = footballer;
        this.colors = colors;
        this.bestForward = bestForward;
        this.titles = titles;
    }

    public void weUnitedSong() {
        System.out.println("weUnitedSong() called");
    }

    @Override
    public void sing() {
        System.out.println("United.sing() called");
        weUnitedSong();
        super.sing();
    }
}
