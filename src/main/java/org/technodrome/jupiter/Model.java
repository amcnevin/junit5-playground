package org.technodrome.jupiter;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Tony McNevin on 6/5/17.
 */
@Data
@NoArgsConstructor
public class Model {


    private String id;

    private Integer intVal;

    private Double dblVal;

    private Long lngVal;

    private Object object;

    private List<Integer> intList;

    public String getNullPointer() {
        throw new NullPointerException();
    }




}
