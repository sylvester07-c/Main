public class Movie {
    protected String title;

    public Movie(String title) {
        this.title = title;
    }

    public  Movie () {

    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }


}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film." );
    }
}
