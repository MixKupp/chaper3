package se233.chapter3.model;

public class FileFreq {
    private String name;
    private String path;
    private Integer freq;

    public String getPath() {
        return path;
    }

    public Integer getFreq() {
        return freq;
    }

    public FileFreq(String name, String path, Integer freq) {
        this.freq = freq;
        this.path = path;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{%s:%d}", name , freq);
    }
}
