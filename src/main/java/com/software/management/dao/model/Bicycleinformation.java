package com.software.management.dao.model;

import java.io.Serializable;
import lombok.Data;

/**
 * bicycleinformation
 * @author 
 */
@Data
public class Bicycleinformation implements Serializable {
    private Long biId;

    private String biName;

    private String biPoint;

    private Boolean biState;

    private String biJd;

    private String biWd;

    private static final long serialVersionUID = 1L;
}