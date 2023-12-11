package pk1;
import java.util.*;

public class Bike implements Comparable<Bike>, Cloneable {
    protected int id;
    protected String name;

    public Bike(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bike exp = (Bike) obj;
        return id == exp.id && name.equals(exp.name);
    }

    @Override
    protected Bike clone() throws CloneNotSupportedException {
        return (Bike) super.clone();
    }

    @Override
    public int compareTo(Bike other) {
        return Integer.compare(this.id, other.id);
    }
	
}
