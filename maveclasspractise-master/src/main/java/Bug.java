public class Bug {
    private String summary;
    private String description;
    private String version;

    public Bug(String summary, String description, String verion){
        this.summary = summary;
        this.description = description;
        this.version = verion;
    }

    public String getSummary(){
        return this.summary;
    }

    public String getDescription(){
        return this.description;
    }

    public String getVersion(){
        return this.version;
    }
}
