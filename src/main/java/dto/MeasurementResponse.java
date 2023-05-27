package dto;

import dto.Measurement;

import java.util.List;

public class MeasurementResponse {
    private List<Measurement> measurementList;

    public List<Measurement> getMeasurementList() {
        return measurementList;
    }

    public void setMeasurementList(List<Measurement> measurementDTOList) {
        this.measurementList = measurementDTOList;
    }
}
