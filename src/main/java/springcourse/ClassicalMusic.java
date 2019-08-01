package springcourse;

public class ClassicalMusic implements Music {

    private String name;

    @Override
    public String getSound() {
        return "ClassicalMusic: Венгерская рапсодия";
    }

    public ClassicalMusic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
