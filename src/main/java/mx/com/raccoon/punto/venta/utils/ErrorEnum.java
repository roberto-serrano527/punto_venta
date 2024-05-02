package mx.com.raccoon.punto.venta.utils;

import lombok.Getter;

@Getter
public enum ErrorEnum {

    PV_GEN_00("PV-GEN-00", "Error generico del servicor", LevelEnum.ERROR, ""),
    PV_GEN_01("PV-GEN-01", "Parametros invalidos o faltantes", LevelEnum.WARNING, ""),
    PV_GEN_02("PV-GEN-02", "Headers invalidos o faltantes", LevelEnum.WARNING, ""),
    PV_GEN_03("PV-GEN-03", "Campo duplicado", LevelEnum.WARNING, "");


    private final String code;

    private final String message;

    private final LevelEnum level;

    private final Object moreInfo;

    ErrorEnum(String code, String message, LevelEnum level, Object moreInfo) {
        this.code = code;
        this.message = message;
        this.level = level;
        this.moreInfo = moreInfo;
    }
}
