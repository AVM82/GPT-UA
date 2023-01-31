package ua.shpp.gpt.models;

public class Echo {
    String echo;

    public Echo(String echo) {
        this.echo = echo;
    }
    public Echo() {}

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }

    @Override
    public String toString() {
        return "Echo{" +
                "echo='" + echo + '\'' +
                '}';
    }
}
