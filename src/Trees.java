import java.util.Objects;

public class Trees {
    String name;

    public Trees(String name) {
        this.name = name;
    }

    public void collect() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trees trees = (Trees) o;
        return name.equals(trees.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
