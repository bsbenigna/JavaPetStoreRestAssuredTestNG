package treinamentorestassured.jsonObjects;
public class Pet {
    private long id;
    private Category category;
    private String name;
    private String[] photoUrls;
    private Tag[] tags;
    private String status;
    public long getID() { return id; }
    public void setID(long value) { this.id = value; }
    public Category getCategory() { return category; }
    public void setCategory(Category value) { this.category = value; }
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
    public String[] getPhotoUrls() { return photoUrls; }
    public void setPhotoUrls(String[] value) { this.photoUrls = value; }
    public Tag[] getTags() { return tags; }
    public void setTags(Tag[] value) { this.tags = value; }
    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }
}

