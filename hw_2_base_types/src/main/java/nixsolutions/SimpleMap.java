package nixsolutions;

public class SimpleMap {

    char ch;
    int x;

    SimpleMap(char ch, int x) {
        this.ch = ch;
        this.x =x;
    }

    @Override
    public String toString() {
        return ch + " - " + x ;
    }
}
