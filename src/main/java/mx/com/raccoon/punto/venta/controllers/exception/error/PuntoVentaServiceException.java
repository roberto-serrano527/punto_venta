package mx.com.raccoon.punto.venta.controllers.exception.error;

import lombok.Getter;
import lombok.Setter;
import mx.com.raccoon.punto.venta.utils.ErrorEnum;
import mx.com.raccoon.punto.venta.utils.LevelEnum;

import java.io.Serializable;

@Getter
@Setter
public class PuntoVentaServiceException implements Serializable {

    private static final long serialVersionUID = -5691533182528968523L;

    private String code;

    private String message;

    private LevelEnum level;

    private Object moreInfo;

    public PuntoVentaServiceException(String code, String message, LevelEnum level, Object moreInfo) {
        this.code = code;
        this.message = message;
        this.level = level;
        this.moreInfo = moreInfo;
    }

    public PuntoVentaServiceException(ErrorEnum errorEnum) {
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
        this.level = errorEnum.getLevel();
        this.moreInfo = errorEnum.getMoreInfo();
    }


    public PuntoVentaServiceException(ErrorEnum errorEnum, Object moreInfo) {
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
        this.level = errorEnum.getLevel();
        this.moreInfo = moreInfo;
    }

}
