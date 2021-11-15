package treinamentorestassured.jsonObjects;

public class Store {
    private long id;
    private long petId;
    private long quantity;
    String chipDate;
    String status;
    Boolean complete;

    public long getId() {
        return id;
    } public void setId(long id) {
        this.id = id;
    }

    public long getPetId() {
        return petId;
    }public void setPetId(long petId) {
        this.petId = petId;
    }

    public long getQuantity() {
        return quantity;
    } public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getChipDate() {
        return chipDate;
    }public void setChipDate(String chipDate) {
        this.chipDate = chipDate;
    }

    public String getStatus() {
        return status;
    } public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getComplete() {
        return complete;
    }public void setComplete(Boolean complete) {
        this.complete = complete;
    }




}
