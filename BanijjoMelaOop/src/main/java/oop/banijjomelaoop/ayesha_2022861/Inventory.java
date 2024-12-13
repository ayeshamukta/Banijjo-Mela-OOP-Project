package oop.banijjomelaoop.ayesha_2022861;

import java.io.Serializable;

public class Inventory implements Serializable {
    private Integer id;
    private String editableCol, value;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEditableCol() {
        return editableCol;
    }

    public void setEditableCol(String editableCol) {
        this.editableCol = editableCol;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Inventory(Integer id, String editableCol, String value) {
        this.id = id;
        this.editableCol = editableCol;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", editableCol='" + editableCol + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
