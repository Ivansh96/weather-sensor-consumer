
import dto.Measurement;
import dto.MeasurementResponse;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DrawChart {
    public static void main(String[] args) {

        List<Double> temperatures = getTemperatures();

        for (Double d : temperatures) {
            System.out.println(d);
        }
    }

    private static List<Double> getTemperatures() {
        final RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/measurements";

        MeasurementResponse jsonResponse = restTemplate.getForObject(url, MeasurementResponse.class);

        if (jsonResponse == null || jsonResponse.getMeasurementList() == null)
            return Collections.emptyList();

        return jsonResponse.getMeasurementList().stream().map(Measurement::getValue)
                .collect(Collectors.toList());
    }
}

