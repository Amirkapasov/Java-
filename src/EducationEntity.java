import java.util.Objects;

abstract class EducationEntity {
    protected String name;

    protected EducationEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void info();

    public abstract void checkStatus();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EducationEntity)) return false;
        EducationEntity that = (EducationEntity) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
