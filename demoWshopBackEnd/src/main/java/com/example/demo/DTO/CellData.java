package com.example.demo.DTO;

public class CellData {
    private String cellName;
    private CellType cellType;
    private String cellData;

    public CellData() {
    }

    public CellData(String cellData) {
        this.cellData = cellData;
    }

    public CellData(String cellName, String cellData) {
        this.cellName = cellName;
        this.cellData = cellData;
    }

    public CellData(String cellName, CellType cellType, String cellData) {
        this.cellName = cellName;
        this.cellType = cellType;
        this.cellData = cellData;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getCellData() {
        return cellData;
    }

    public void setCellData(String cellData) {
        this.cellData = cellData;
    }
}
