package org.example;

class Exhibition extends Event {
    private Integer noOfStalls;
    private Double rentPerStall;

    public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls, Double rentPerStall) {
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    public Integer getNoOfStalls() {
        return noOfStalls;
    }

    public Double getRentPerStall() {
        return rentPerStall;
    }

    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public void setRentPerStall(Double rentPerStall) {
        this.rentPerStall = rentPerStall;
    }

    @Override
    Double calculateAmount() {
        return noOfStalls * rentPerStall;
    }
}

