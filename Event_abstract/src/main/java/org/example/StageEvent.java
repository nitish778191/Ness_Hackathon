package org.example;

class StageEvent extends Event {
    private Integer noOfShows;
    private Double costPerShow;

    public StageEvent(String name, String detail, String type, String organiser, Integer noOfShows, Double costPerShow) {
        super(name, detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    public Integer getNoOfShows() {
        return noOfShows;
    }

    public Double getCostPerShow() {
        return costPerShow;
    }

    public void setNoOfShows(Integer noOfShows) {
        this.noOfShows = noOfShows;
    }

    public void setCostPerShow(Double costPerShow) {
        this.costPerShow = costPerShow;
    }

    @Override
    Double calculateAmount() {
        return noOfShows * costPerShow;
    }
}