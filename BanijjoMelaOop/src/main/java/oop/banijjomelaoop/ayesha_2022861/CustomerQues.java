package oop.banijjomelaoop.ayesha_2022861;

public class CustomerQues {
    private String custQues;

    public String getCustQues() {
        return custQues;
    }

    public void setCustQues(String custQues) {
        this.custQues = custQues;
    }

    public CustomerQues(String custQues) {
        this.custQues = custQues;
    }

    public CustomerQues() {
    }

    @Override
    public String toString() {
        return "Customer Question :" + custQues + '\n';
    }
}
